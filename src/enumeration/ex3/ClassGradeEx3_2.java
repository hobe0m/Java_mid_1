package enumeration.ex3;


public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // Grade grade = new Grade(); // enum은 생성 불가
        // int result = discountService.discount(newClassGrade, price);
        // System.out.println("newClassGrade 등급의 할인 금액 = " + result);

        // Enum은 열거형 내부에서 상수로 지정하는 것 외에 직접 생성이 불가하므로 컴파일 오류가 발생

        // 열거형(ENUM)의 장점
        //  - 타입 안전성 향상 : 열거형은 사전에 정의된 상수들로만 구성되므로, 유효하지 않은 값이 입력된 가능성이 없다(컴파일 오류 발생).
        //  - 간결성 및 일관성 : 열거형을 사용하면 코드가 더 간결하고 명확해지며, 데이터의 일관성이 보장된다.
        //  - 확장성 : 새로운 회원 등급의 타입을 추가하고 싶을 때, ENUM에 새로운 상수를 추가하기만 하면 된다.

        // 참고
        // 열거형을 사용하는 경우 static import를 적절하게 사용하면 더 읽기 좋은 코드를 만들 수 있다.
    }
}
