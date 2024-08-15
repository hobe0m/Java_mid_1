package nested.ex;

import java.util.Random;

// 지역 클래스를 통한 리팩토링
public class Ex1RefMainV2 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    // static을 뺀 class들을 main의 내부에 집어 넣어 지역 클래스로 사용
    //  - 정적 중첩 클래스에서 지역 클래스로 변환
    public static void main(String[] args) {

        System.out.println("hello 실행");
        class Dice implements Process {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " + randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i : " + i);
                }
            }
        }

        // Process(Dice) dice = new Dice();
        // Process(Sum) sum = new Sum();
        // 이런 식으로 사용해도 된다.

        hello(new Dice());
        hello(new Sum());
    }

    // 이 때, 한 번씩만 생성해서 간단하게 사용하는 경우에는 익명 클래스로 만들어서 사용할 수 있다.
}
