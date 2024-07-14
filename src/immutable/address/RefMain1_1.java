package immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");

        // 같은 참조값을 바라보기 때문에 둘 다 부산으로 변경된다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 공유 참조와 사이드 이펙트
        // 사이드 이펙트(Side Effect)는 프로그래밍에서 어떤 계산이 주된 작업 외에 추가적인 부수 효과를 일으키는 것을 말한다.
        // b의 값을 부산으로 바꿨을 때, a도 부산으로 바뀌는 것이 사이드 이펙트이다.
        // 프로그래밍에서는 프로그램의 특정 부분에서 발생한 변경이 의도치 않게 다른 부분에 영향을 미치기 때문에 보통 부정적인 의미로 사용한다.
        //  - 이로 인해 디버깅이 어려워지고 코드의 안정성이 저하될 수 있다.

        // 사이드 이펙트의 해결방안
        // 해결방안은 아주 단순하다.
        // a와 b가 처음부터 다른 인스턴스를 참조하게끔 하면 된다.
    }
}
