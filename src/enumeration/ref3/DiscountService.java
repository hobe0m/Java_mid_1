package enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        // 계산 로직을 없애고, grade에 있는 계산 로직을 사용한다.
        // 따라서 discount()에 price만 넣으면 계산된 값이 반환된다.
        return grade.discount(price);
    }
}
