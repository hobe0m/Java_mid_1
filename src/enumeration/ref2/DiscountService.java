package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {

        // ctrl + alt + n :변수를 선언할 필요가 없을 때 Inline Variable 사용
        return price * grade.getDiscountPercent() / 100;
    }
}
