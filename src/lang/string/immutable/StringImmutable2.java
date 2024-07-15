package lang.string.immutable;

public class StringImmutable2 {
    // String 클래스
    // 불변 객체
    // String은 불변 객체이다.
    // 따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 불변 객체에 변경이 필요한 경우 기존 값을 건드리지 않고 새로운 값을 반환만 하기 때문에 그 값을 받아서 사용해야 한다.

        // String이 불변으로 설계된 이유(사이드 이펙트)
        //  - 문자열 풀을 쓰기 때문에 String 인스턴스의 값이 중간에 변경되면 같은 문자열을 참고하는 다른 변수의 값도 함께 변경되기 때문이다.
    }
}
