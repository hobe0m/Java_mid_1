package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법(자바 문법에 맞기 때문)은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); b의 값을 부산으로 변경해야 하지만 이 메서드는 삭제되었다.
        System.out.println("부산 -> b");
        b = new ImmutableAddress("부산"); // 따라서 어쩔 수 없이 새로운 객체를 생성해서 값을 담는다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 정리
        // 불변(실수가 발생할 가능성도 없앤다)이라는 단순한 제약을 통해서 사이드 이펙트라는 큰 문제를 예방할 수 있다.
        // 객체의 공유 참조는 막을 수 없으므로 불변 객체를 만들어서 사용하면 된다.
        // 불변 객체는 값을 변경할 수 없으므로 값을 변경하고 싶다면 새로운 불변 객체를 생성해야 한다.
        //  - 이렇게 하면 기존 변수들이 참조하는 값에는 영향을 주지 않는다.

        // 참고
        // 가변(Mutable) 객체 vs 불변(Immutable) 객체
        // 가변은 이름 그대로 처음 만든 이후 상태가 변할 수 있다는 뜻이다.
        //  - 사전적으로 사물의 모양이나 성질이 달라질 수 있다는 뜻이다.
        //  - 여기서 Address
        // 불변은 이름 그대로 처음 만든 이후 상태가 변할 수 않는다는 뜻이다.
        //  - 사전적으로 사물의 모양이나 성질이 달라질 수 있다는 뜻이다.
        //  - 여기서 ImmutableAddress
    }
}
