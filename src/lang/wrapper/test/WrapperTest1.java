package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // parseInt는 Integer의 메서드, 문자열을 int형으로 바꿔준다.
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("두 수의 합 : " + (num1 + num2));
    }
}
