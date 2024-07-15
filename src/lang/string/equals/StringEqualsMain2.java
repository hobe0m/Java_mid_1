package lang.string.equals;

public class StringEqualsMain2 {
    // 그렇다면 문자열 비교를 할 때, 문자열 리터럴을 사용할 때는 == 비교를 하고, new String()을 직접 사용하는 경우에만 equals() 비교를 하면 되지 않을까?
    // 문자열 : 동일성(동일성이 같으면 동등성도 같음)
    // 객체 생성 : 동등성(동일성은 무조건 다름)
    // 문자열 비교를 할 때는 항상 동일성 비교가 아닌 동등성 비교를 해야 한다.
    // 항상 eqauls()를 사용해야 한다.
    // 객체로 만든 것이 넘어오는지 리터럴을 사용한 것이 넘어오는 지 모르기 때문이다.

    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        return x == y;
        // return x.equals(y);
    }
}
