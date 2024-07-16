package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        // String은 불변 객체이므로, StringBuilder(가변 String)을 생성하여 reverse로 변환 후 toString으로 다시 불변 객체로 만들어준다.
        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("reversed = " + reversed);
    }
}
