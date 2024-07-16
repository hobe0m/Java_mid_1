package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";

        String hello = str.substring(0,5);
        String txt = str.substring(5);
        // subString(5, 9)로 해도 된다.

        System.out.println("fileName : " + hello);
        System.out.println("extName : " + txt);
    }
}
