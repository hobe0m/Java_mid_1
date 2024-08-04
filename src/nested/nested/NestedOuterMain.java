package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // 외부 클래스 없이 내부에 중첩 클래스의 인스턴스만 생성해도 된다.
        // 외부, 중첩 클래스의 인스턴스는 연관이 없기 때문이다.
        NestedOuter outer = new NestedOuter();

        // 내부의 정적 중첩 클래스의 객체를 생성하고 싶을 때는 외부 클래스.내부 클래스의 형식을 사용하면 된다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        // 클래스 정보 확인
        // 내부의 클래스는 외부 클래스 + $ + 내부 클래스의 형식으로 표현된다.
        System.out.println("nestedClass = " + nested.getClass());

        // 정적 중첩 클래스는 new 바깥 클래스.중첩 클래스()로 생성할 수 있다.
        // 따라서 NestedOuter.Nested와 같이 접근이 가능하다.
        // 여기서 outer와 nested 인스턴스는 서로 아무 관계가 없는 인스턴스이다.
        // 단지 클래스 구조 상 중첩해 두었을 뿐이다.
        // 따라서 둘이 아무런 관련이 없으므로 정적 중첩 클래스의 인스턴스만 따로 생성해도 된다.

        // 정리
        // 정적 중첩 클래스는 사실 다른 클래스를 그저 중첩해 둔 것일 뿐이다.
        // 쉽게 이야기 해서 둘은 아무런 관계가 없다.
        // 정적 필드에 접근하는 것은 중첩 클래스가 아니어도 클래스명.정적 필드명을 통해 접근할 수 있기 때문이다.
        // 따라서 클래스를 2개 따로 만든 것이라고 생각하면 된다.
        // 유일한 차이점은 private에 접근할 수 있다는 것이다.
    }
}
