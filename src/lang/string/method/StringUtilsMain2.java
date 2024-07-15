package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";


        // format 메서드 활용 1
        // System.out.println("num : " + num + ", bool : " + bool + ", str : " + str); 이 코드를 더 편리하게 만들어준다.
        // %d(숫자), %b(논리), %s(문자열)를 통해 num, bool, str을 알아서 넣어준다.
        String format1 = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println(format1);

        // format 메서드 활용 2
        // 소수점 아래가 존재하는 실수를 %.(출력할 소수점 아래 자릿수)f를 통해 출력할 수 있다.
        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        // printf, 소수를 format을 쓰지 않고 원하는 소수점 아래 자릿 수까지 출력할 수 있다.
        System.out.printf("숫자 : %.2f\n", 10.1234); // \n은 한 줄 개행을 하기 위함

        // matched 메서드, 정규표현식과 문자열이 일치하는지 확인
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
        // str이 regex의 정규표현식과 맞는지 확인하는 메서드
        // Hello, 로 시작하고 Java! 혹은 World가 오는지 확인 후 true / false로 반환
    }
}
