package nested.ex;

import java.util.Random;

// 람다를 통한 리팩토링 2
//  - 메서드를 매개 변수로 전달
public class Ex1RefMainV5 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + randomValue);
        });

        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i : " + i);
            }
        });
    }

    // 위 코드에서는 클래스나 인스턴스를 정의하지 않고, 메서드(더 정확히는 함수)의 코드 블럭을 직접 전달한다.
    // 람다에 대한 자세한 내용은 별도로 나중에 학습하므로 지금은 이정도만 알아두면 된다.

    // 람다가 있다고 해서, 익명 클래스가 필요하지 않은 것은 아니다.
    // 람다는 지역 변수를 선언할 수 없지만 익명 클래스는 지역 변수를 선언할 수 있다.
    // 따라서 람다와 익명 클래스는 비슷하지만 서로 다른 역할(용도가 다름)을 하고 두 개 다 필요하다고 생각하면 된다.
}