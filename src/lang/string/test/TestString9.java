package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        // split은 특정 문자를 기준으로 문자열을 나누는 것, 그러므로 나눈 문자열은 String 배열에 담아야 한다.
        String[] parts = email.split("@");
        String ID = parts[0];
        String Domain = parts[1];

        System.out.println("ID = " + ID);
        System.out.println("Domain = " + Domain);
    }
}

