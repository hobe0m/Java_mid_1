package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // 불변이기에 클래스에 직접 접근해서 꺼내와야 한다.

        // Integer.valueOf() -> ()안의 데이터 형을 Integer로 바꾸어준다.
        //  -> int, String(숫자) 가능

        // Integer.intValue() -> Integer 타입에서 int만 꺼내준다.

        // 문자열(숫자)을 Integer(int의 래퍼 클래스)로 변경하는 방법
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);
        System.out.println("integer2 = " + integer2);


    }
}
