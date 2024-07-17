package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        
        // String -> Integer (valueOf를 사용해 문자열화 되어있는 숫자를 객체화된 숫자로 바꾼다)
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);
        
        // 오토 박싱과 오토 언박싱
        
        // Integer을 int형태에 넣으면 오토 언박싱 가능
        int intValue = integer1;
        System.out.println("intValue = " + intValue);
        
        // int를 Integer에 넣으면 오토 박싱 가능
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
