package lang.wrapper;

public class AutoBoxingMain1 {
    // 래퍼 클래스
    // 오토 박싱(AutoBoxing)
    // Integer를 int로 변환하려면 valueOf(), intValue() 메서드를 사용하면 된다.
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); // Integer라는 상자에 기본형 7을 넣어서 만듦

        // Wrapper -> primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue); // toString() 메서드가 오버라이딩 되어 객체의 정보가 아닌 value가 읽힌다.
        System.out.println("unboxedValue = " + unboxedValue);

        // 박싱(Boxing) : valueOf()
        // 언박싱(UnBoxing) : xxxValue(), 여기서 xxx는 데이터 타입(int, double...)

        // 박싱과 언박싱의 빈도가 높아 자바는 5부터 오토 박싱(Auto-Boxing), 오토 언박싱(Auto-Unboxing)을 제공한다.
    }
}
