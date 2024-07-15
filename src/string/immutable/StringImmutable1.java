package string.immutable;

public class StringImmutable1 {
    // String 클래스
    // 불변 객체
    // String은 불변 객체이다.
    // 따라서 생성 이후에 절대로 내부의 문자열 값을 변경할 수 없다.
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");

        // concat이 합치는 메서드인데, 왜 바뀌지 않았을까?
        // 불변객체이기 때문이다.
        // 따라서 다른 객체에 넣어서 사용해야 한다.
        System.out.println("str = " + str);
        System.out.println(str.concat(" java"));
    }
}
