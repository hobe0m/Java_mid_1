package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces = "     Java Programming     ";

        System.out.println("소문자로 변환 : " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환 : " + strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim) : " + "*" + strWithSpaces.trim() + "*"); // SpaceBar를 사용해서 생신 Whitespace만 제거 가능
        System.out.println("공백 제거(strip) : " + "*" + strWithSpaces.strip() + "*"); // Whitespace와 유니코드 공백(특수한 공백)을 포함해서 제거한다. 자바 11
        System.out.println("앞 공백 제거(strip) : " + "*" + strWithSpaces.stripLeading() + "*"); // Leading을 사용해 앞 공백만 제거
        System.out.println("앞 공백 제거(strip) : " + "*" + strWithSpaces.stripTrailing() + "*"); // Trailing을 사용해 뒷 공백만 제거
    }
}
