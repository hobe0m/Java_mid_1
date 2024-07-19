package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    // 열거형의 주요 메서드
    // 모든 열거형은 java.lang.Enum 클래스를 자동으로 상속 받아 해당 클래스가 제공하는 기능들을 사용할 수 있다.
    public static void main(String[] args) {
        // 모든 ENUM을 반환
        Grade[] values = Grade.values();

        // 이 때, 배열을 출력하면 참조값이 나오므로 Arrays.toString을 사용해준다.
        //  - 주어진 배열의 요소들을 문자열로 변환하고 각 요소를 쉼표로 구분하여 한 줄에 나열
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            // value.name은 상수의 이름을 문자열로 반환
            // value.ordinal은 상수가 정의된 순서를 정수값으로 반환
            System.out.println("name : " + value.name() + ", ordinal : " + value.ordinal());
        }

        // String -> Enum으로 변환
        // 잘못된 문자가 들어갔을 때는 IllegalArgumentException 발생
        //  - 소문자 등..
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능
        
        // ENUM의 주요 메서드
        // values(): 모든 ENUM 상수를 포함하는 배열을 반환한다.
        // valueOf(String name): 주어진 이름과 일치하는 ENUM 상수를 반환한다.
        // name(): ENUM 상수의 이름을 문자열로 반환한다.
        // ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환한다.
        // toString(): ENUM 상수의 이름을 문자열로 반환한다.
        //  - name()메서드와 유사하지만, toString()은 직접 오버라이드 할 수 있다.

        // 주의
        // ordinal()은 가급적 사용하지 않는 것이 좋다.
        // 이 값을 사용하다가 중간에 상수를 선언하는 위치가 변경되면 전체 상수의 위치가 모두 변경될 수 있기 때문이다.
        // 예를 들어 중간에 BASIC 다음에 SILVER가 추가되는 경우 GOLD와 DIAMOND의 값이 하나씩 추가된다.

        // 문제가 되는 이유
        // 기존 GOLD의 ordinal() 값인 1을 데이터베이스나 파일에 저장하고 있었는데, 중간에 SILVER가 추가되면 데이터베이스나 파일에 있는 값은 그대로 1이지만 애플리케이션상에서는 2가 된다.
        // 따라서 기존 GOLD 회원이 SILVER가 되는 큰 버그가 발생할 수 있기 때문이다.

        // 열거형 정리
        // 열거형은 java.lang.Enum을 자동(강제)으로 상속받는다.
        // 열거형은 이미 java.lang.Enum을 상속받았기 때문에 다른 클래스를 상속받을 수 없다.
        // 열거형은 인터페이스를 구현(구현체가 될 수 있다는 것)할 수 있다.
        // 열거형에 추상 메서드를 선언하고 구현할 수 있다.
        //  - 이 경우 익명 클래스와 같은 방식을 사용하는데 익명 클래스는 뒤에서 다룬다.
    }
}
