package nested.inner;

public class InnerOuter {
    // 내부 클래스
    // 정적 중첩 클래스는 바깥 클래스와 서로 관계가 없다.
    // 하지만 내부 클래스는 바깥 클래스의 인스턴스를 이루는 요소가 되므로 내부 클래스는 바깥 클래스의 인스턴스에 소속된다.

    // 정적 중첩 클래스는 static이 붙고, 바깥 클래스의 인스턴스에 소속되지 않는다.
    // 내부 클래스는 static이 붙지 않고, 바깥 클래스의 인스턴스에 소속된다.

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print() {
            // 자기 자신의 멤버에 접근 가능
            System.out.println(innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, private도 접근 가능(같은 클래스이므로)
            System.out.println(outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능
            System.out.println(outClassValue);

            // 내부 클래스는 앞에 static이 붙지 않아 인스턴스 멤버가 된다.
            // 따라서 자신의 멤버, 바깥 클래스의 인스턴스 멤버, 바깥 클래스의 클래스 멤버 전부에 접근 가능하다.
            // 이 때, 바깥 클래스의 멤버가 private 접근 제어자를 가져도 접근 가능하다.
            //  - 바깥 클래스와 내부 클래스는 동일한 클래스이기 때문이다.
            //  - 내부 클래스가 바깥 클래스의 요소
            
            
        }
    }
}
