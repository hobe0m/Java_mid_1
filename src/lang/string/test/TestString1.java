package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";

        System.out.println(url.startsWith("http"));

        // 결과를 boolean에 넣어서 사용할 수도 있다.
        // boolean result = url.startsWith("https://");
        // System.out.println(result);
    }
}
