package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드 : 다른 형태의 데이터를 문자열(String)으로 바꿔준다.
        String numString = String.valueOf(num);
        System.out.println("숫자 -> 문자열 값 : " + numString); // 숫자의 문자열 값
        String boolString = String.valueOf(bool);
        System.out.println("논리형 -> 문자열 값 : " + boolString); // boolean의 문자열 값
        String objString = String.valueOf(obj);
        System.out.println("객체 -> 문자열 값 : " + objString); // 객체의 문자열 값(객체의 정보 추출 즉, toString()의 결과)

        String numString2 = "" + num; // 문자 + x(숫자, 논리 등) = 문자
        System.out.println("빈 문자열 + num : " + numString2); // 여기서 100은 "100"이다.

        // toCharArray 메서드(문자열을 문자 배열로 바꿔주는 메서드)
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray); // 앞에 문자열이 더해지면 객체의 참조값을 출력한다.
        // 따라서 for문으로 출력, print를 사용해 문자열처럼 이어 붙인다.
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println(); // 한 줄 띄워주기 위함
    }
}
