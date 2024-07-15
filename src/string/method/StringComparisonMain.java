package string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없음, 모두 소문자
        String str3 = "Hello, world";

        System.out.println("str1 equals str2 : " + str1.equals(str2)); // 대소문자 구분
        System.out.println("str1 equals str2 : " + str1.equalsIgnoreCase(str2)); // 대소문자 구분을 무시

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // a와 b는 사전적으로 하나 차이(사전적으로 먼저 등장하는 것이 비교대상이 되면 양수가 출력)
        System.out.println("'a' compareTo 'b' : " + "a".compareTo("b")); // a와 b는 사전적으로 하나 차이(사전적으로 먼저 등장하는 것이 기준이 되면 음수가 출력)
        System.out.println("'c' compareTo 'a' : " + "c".compareTo("a")); // a와 c는 사전적으로 두 개 차이
        System.out.println("'a' compareTo 'c' : " + "a".compareTo("c")); // a와 c는 사전적으로 두 개 차이

        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        // compareTo 메서드는 문자열을 사전 순으로 비교하되, 비교를 시작하는 지점부터 다른 문자가 나타날 때까지만 비교를 수행한다.
        // 즉, hello, 까지는 똑같고, j와 w만 다르기 때문에 그 둘을 비교하고 결과를 출력한다.
        System.out.println("str1 compareTo str2 : " + str1.compareToIgnoreCase(str2)); // 대소문자 구분 외에는 다른 것이 없기 때문에 0이 출력된다.

        System.out.println("str1 starts with 'Hello : " + str1.startsWith("Hello") ); // str1이 Hello로 시작하는가?
        System.out.println("str1 ends with 'Java!' : " + str1.endsWith("Java!") ); // str1이 Java로 끝나는가?
    }
}
