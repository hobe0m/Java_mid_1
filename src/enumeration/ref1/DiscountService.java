package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        // 미리 할인율을 꺼내는 메서드를 만들어놨으니 할인율을 꺼내서 int에 담기만 하면 된다.
        // 그 후 price에 할인율을 곱한 후 100으로 나눈 값을 return한다.

        // int discountPercent = classGrade.getDiscountPercent();
        // return price * discountPercent / 100;

        // ctrl + alt + n : Inline Variable 단축키, 변수가 불필요하게 많이 사용되거나 변수의 범위가 작아서 직접 사용하는 것이 코드의 가독성을 높일 수 있을 경우 사용
        // 변수를 선언할 필요 없이 바로 return값에 넣으면 되는 경우 사용하면 한 줄로 만들어 준다.
        return price * classGrade.getDiscountPercent() / 100;


    }
}
