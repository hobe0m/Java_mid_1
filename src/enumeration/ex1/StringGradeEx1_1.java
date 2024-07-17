package enumeration.ex1;
public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 실수가 발생하면 컴파일 오류가 발생하기 때문에 그럴 일이 없다.
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);

        // 문자열 상수를 사용해 코드가 더 명확해졌다.
        // 인자 전달 시 StringGrade가 제공하는 문자열 상수를 사용하면 되고, 더 좋은 점은 오류 발생 시 컴파일 시점에 확인 가능하다는 점이다.
    }
}
