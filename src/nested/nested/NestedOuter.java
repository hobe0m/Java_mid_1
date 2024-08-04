package nested.nested;

public class NestedOuter {
    // 정적 중첩 클래스
    // 정적 중첩 클래스는 앞에 static이 붙는다.
    // 자신의 멤버에는 당연히 접근 가능
    // 바깥의 클래스 멤버에 접근 가능
    // 바깥의 인스턴스 멤버에는 접근 불가능

    // static value 생성
    private static int outClassValue = 3;

    // instance value 생성
    private int outInstanceValue = 2;

    // 정적 중첩 클래스 생성
    // 클래스 안에 클래스 생성 가능
    static class Nested {
        // 멤버 변수 생성
        private int nestedInstanceValue = 1;

        // 자신의 멤버에 접근하는 메서드 생성
        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            // static이기에 static(클래스 영역)은 당연히 instance(인스턴스 영역)에 접근할 수 없다.
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다(private도 접근 가능).
            // 원래도 클래스 영역을 통해 static 즉, 클래스 멤버에는 접근할 수 있지만 정적 중첩 클래스는 private 멤버에도 접근할 수 있다는 점이 다르다.
            System.out.println(NestedOuter.outClassValue);

            // 바깥 클래스 이름 + dot(.)을 사용하지 않아도 접근할 수 있다.
            System.out.println(outClassValue);

            // private 접근 제어자
            // private 접근 제어자는 같은 클래스 안에 있을 때만 접근할 수 있다.
            // 중첩 클래스도 바깥 클래스와 같은 클래스 안에 있으므로 중첩 클래스 또한 바깥 클래스의 private 접근 제어자에 접근할 수 있다.
        }
    }
}
