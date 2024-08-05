package nested;

public class ShadowingMain {
    // 같은 이름의 바깥 변수 접근
    // 바깥 클래스의 인스턴스 변수명과 내부 클래스의 인스턴스 변수명이 같을 때 바깥 클래스의 인스턴스 변수에 접근하는 방법

    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("this.value : " + this.value);
            System.out.println("ShadowingMain.value : " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();

        // 지역 변수가 우선 순위를 갖는다.
        inner.go();

        // 내부 클래스의 인스턴스 변수는 this를 활용해 접근한다.
        // 외부 클래스의 인스턴스 변수는 바깥 클래스명.this를 활용해 접근한다.

        // 변수의 이름이 같으면 어떤 변수를 먼저 사용할 지 몰라 우선 순위가 필요하다.
        // 이 때, 프로그래밍에서는 대부분 더 가깝거나 더 구체적인 것이 우선권을 가진다.
        //  - 즉, 사람이 직관적으로 이해하기 쉬운 방향으로 우선 순위를 설계한다.

        // go()의 경우 지역 변수 value가 가장 가깝기 때문에 우선 순위가 가장 높다.
        // 이렇게 다른 변수들을 가려서 보이지 않게 하는 것을 섀도잉(Shadowing)이라고 한다.

        // 따라서 this.value를 통해 내부 클래스의 인스턴스에 접근하고, 외부 클래스명.this.value를 통해 외부 클래스의 인스턴스에 접근해야 한다.
        // 프로그래밍에서 가장 중요한 것은 명확성이므로 이렇게 이름이 같은 경우 처음부터 이름을 서로 다르게 지어 명확하게 구분하는 것이 더 나은 방법이다.
    }
}
