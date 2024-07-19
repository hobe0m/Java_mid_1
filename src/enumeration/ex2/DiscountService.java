package enumeration.ex2;



public class DiscountService {

    // discount() 메서드는 매개변수로 ClassGrade 클래스를 사용한다.
    // 값을 비교할 때는 classGrade == ClassGrade.BASIC과 같이 == 참조값 비교를 하면 된다.
    //  - 매개변수에 넘어오는 인수도 ClassGrade가 가진 상수 중에 하나를 사용한다.
    //  - 따라서 열거한 상수의 참조값으로 비교(==)하면 된다.

    // 어차피 ClassGrade에는 BASIC, GOLD, DIAMOND 3가지 밖에 없으므로 인수에 3가지 밖에 들어올 수 없다.
    // 따라서 ClassGrade에 있는 상수들로 비교하면 된다.
    // 이 때 상수가 하나의 객체이므로 참조값을 비교하면 된다.
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        return price * discountPercent / 100;
    }
}
