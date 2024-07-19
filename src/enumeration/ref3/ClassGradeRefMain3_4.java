package enumeration.ref3;

public class ClassGradeRefMain3_4 {
    public static void main(String[] args) {
        // 새로운 등급이 추가되어도 Main 코드의 변경 없이 출력하기
        // Grade.values() 사용
        int price = 10000;

        Grade[] grades = Grade.values();
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
    }

    // Grade.values()를 사용하면 Grade 열거형의 모든 상수를 배열로 구할 수 있다.
}
