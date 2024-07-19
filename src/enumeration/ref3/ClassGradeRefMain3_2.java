package enumeration.ref3;

public class ClassGradeRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;

        // 이제 discountService를 사용할 필요가 없다.
        // Inline Variable로 간결하게 정리
        System.out.println("BASIC 등급의 할인 금액 : " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액 : " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액 : " + Grade.DIAMOND.discount(price));

        // 각각의 등급별로 자신의 discount()를 직접 호출하면 할인율을 구할 수 있다.
        // DiscountService를 제거해도 된다.
    }
}
