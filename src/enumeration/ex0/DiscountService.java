package enumeration.ex0;

public class DiscountService {
    // 열거형 ENUM
    // 문자열과 타입 안전성 1

    // 비즈니스 요구사항
    //  - 고객은 3등급으로 나누고, 상품 구매 시 등급별로 할인을 적용, 할인 시 소수점 이하는 버린다.
    //  - BASIC - 10% 할인
    //  - GOLD - 20% 할인
    //  - DIAMOND - 30% 할인

    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인 X");
        }
        // 할인율 적용(가격 X 할인율 / 100;
        return price * discountPercent / 100;
    }
}
