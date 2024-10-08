package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        // 공유 참조와 사이드 이펙트
        // 사이드 이펙트(Side Effect)는 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 말한다.
        // b의 값을 부산으로 바꿨을 때, a도 부산으로 바뀌는 것이 사이드 이펙트이다.
        // 프로그래밍에서는 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치기 때문에 보통 부정적인 의미로 사용한다.
        //  - 이로 인해 디버깅이 어려워지고 코드의 안정성이 저하될 수 있다.

        // 사이드 이펙트의 해결방안
        // 해결방안은 아주 단순하다.
        // a와 b가 처음부터 다른 인스턴스를 참조하게끔 하면 된다.

        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 여러 변수가 하나의 객체를 공유하는 것을 막을 방법은 없다.
        // 지금까지 발생한 문제는 같은 객체(인스턴스)를 변수 a,b가 동일하게 참조해서 생겼다.
        // 따라서 단순하게 서로 다른 객체를 참조해서, 같은 객체를 공유하지 않으면 문제가 해결된다.

        // 그런데 하나의 객체를 여러 변수가 공유하지 않도록 강제로 막을 수 있는 방법이 없다는 문제가 있다.
        //        Address a = new Address("서울");
        //        Address b = a;
        // 이런 공유를 강제로 막을 방법이 없다는 것이다.
        // 왜냐하면 자바 문법상 아무런 문제가 없기 때문이다.
        // 기본형에서는 이러한 문제가 없지만(복사해서 대입하므로), 참조형의 경우 참조값을 복사해서 대입하기 때문에 여러 변수에서 얼마든지 같은 객체를 공유할 수 있다.
    }
}
