package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 생성이 막혀 있는 것을 확인하고 상수를 써야겠다고 생각
        //  - ClassGrade의 인스턴스를 생성하는 것은 해당 클래스 내부에서만 가능
        //  - 따라서 ClassGrade 인스턴스를 사용할 때는 ClassGrade 내부에 정의한 상수만 사용해야 하고, 아니면 컴파일 오류 발생
        // ClassGrade newClassGrade = new ClassGrade();
        // int result = discountService.discount(newClassGrade, price);
        // System.out.println("newClassGrade 등급의 할인 금액 = " + result);
    }
}
