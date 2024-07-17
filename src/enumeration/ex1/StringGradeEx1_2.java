package enumeration.ex1;



public class StringGradeEx1_2 {
    public static void main(String[] args) {
        // 하지만 문자열 상수를 사용해도, 지금까지 발생한 문제들을 근본적으로 해결할 수는 없다.
        // 왜냐하면 String 타입은 어떤 문자열이든 입력할 수 있기 때문이다.

        // 누군가 주석을 달아 예방할 수는 있지만 주석을 달아도 누군가는 주석을 깜빡하고 문자열을 직접 입력할 수 있다.
        //  - 메서드의 인자가 String 타입으로 나오기 때문에 상수가 아닌 다른 값을 넣을 수 있다.

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);

        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);

        // 소문자 입력
        int gold1 = discountService.discount("gold", price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);

        // 존재하지 않는 등급 출력
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타 출력
        System.out.println("DIAMONDD 등급의 할인 금액 : " +  price);

        // 소문자 출력
        System.out.println("gold 등급의 할인 금액 : " + gold1);
    }
}
