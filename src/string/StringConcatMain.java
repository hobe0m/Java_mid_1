package string;

public class StringConcatMain {
    // String은 원칙적으로 클래스이기에 기본형이 아니라 참조형이다.
    // 참조형은 변수에 계산할 수 있는 값이 들어있는 것이 아니라 x001과 같이 계산할 수 없는 참조값이 들어있으므로 원칙적으로 +, -와 같은 연산을 사용할 수 없다.
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b); // 객체의 기능이므로 사용 가능
        String result2 = a + b; // x001 + x002, 원칙적으로는 불가능

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 원래는 자바에서 문자열을 더할 때는 String이 제공하는 concat()과 같은 메서드를 사용해야 한다.
        // 하지만 문자열은 너무 자주 다루어지기 때문에 자바 언어에서 편의상 특별히 + 연산을 제공한다.
        // 이는 String에서만 예외적으로 적용되는 예시이다.
    }
}
