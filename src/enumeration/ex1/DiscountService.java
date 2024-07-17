package enumeration.ex1;

public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        // 이제는 오타가 발생하면 컴파일 오류 발생
        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인 X");
        }
        // 할인율 적용(가격 X 할인율 / 100;
        return price * discountPercent / 100;
    }
}
