package lang.wrapper;

public class MyIntegerMethodMain0 {
    // Wrapper(래퍼) 클래스
    // 기본형의 한계 1
    // 자바는 객체 지향 언어인데, 기본형은 객체가 아니다.
    // 따라서 한계가 존재한다.
    //  - 객체가 아니므로 객체 지향 프로그래밍의 장점을 살릴 수 없다.
    //   - 예를 들어 객체는 유용한 메서드를 제공할 수 있는데, 기본형은 객체가 아니므로 메서드를 제공할 수 없다.
    //   - 추가로 객체 참조가 필요한 컬렉션 프레임워크(뒤에서 설명)와 제네릭(뒤에서 설명)을 사용할 수 없다.
    //  - null 값을 가질 수 없음
    //   - 기본형 데이터 타입은 null 값을 가질 수 없다.
    //   - 때로는 데이터가 없음이라는 상태를 나타내야 할 필요가 있는데, 기본형은 항상 값을 가지기 때문에 이런 표현을 할 수 없다.
    public static void main(String[] args) {
        // 10을 다른 숫자들과 비교(메서드 사용)
        int value = 10;

        int i1 = compareTo(value, 5);
        System.out.println("i1 = " + i1);

        int i2 = compareTo(value, 10);
        System.out.println("i2 = " + i2);

        int i3 = compareTo(value, 20);
        System.out.println("i3 = " + i3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
    // 여기서는 value와 비교 대상을 compareTo()라는 외부 메서드를 사용해서 비교한다.
    // 그런데 자기 자신인 value와 다른 값을 연산하기 때문에 value가 반드시 사용된다.
    // 이럴 때 value가 객체라면 value 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만드는 것이 더 유용할 것이다.
}
