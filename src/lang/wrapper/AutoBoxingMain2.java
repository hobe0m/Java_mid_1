package lang.wrapper;

public class AutoBoxingMain2 {
    // 오토 박싱(Auto Boxing)과 오토 언박싱(Auto Unboxing)
    // 컴파일러가 valueOf(), xxxValue()등의 코드를 추가해주는 것이다.
    public static void main(String[] args) {
        // Primitive -> Wrapper
        // 오토 박싱(Auto Boxing)
        int value = 7;
        Integer boxedValue = value; // int를 Integer 객체에 넣으려고 하면 자동으로 변환

        // Wrapper -> Primitive
        // 오토 언박싱(Auto Unboxing)
        int unboxedValue = boxedValue; // Integer 객체를 int형에 넣으려고 하면 자동으로 변환

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
