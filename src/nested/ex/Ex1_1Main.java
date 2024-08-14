package nested.ex;

import java.util.Random;

public class Ex1_1Main {
    // 코드 조각들을 전달해서 하나의 메서드에서 실행될 수 있도록 리팩토링
    // 랜덤으로 3개의 숫자를 뽑아 출력한 뒤, 주사위의 합도 출력

    public static void randomDice() {
        int sum = 0;

        System.out.println("프로그램 시작");

        for (int i = 1; i < 4; i++) {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println(i + "번째 주사위 : " + randomValue);
            sum += randomValue;
        }
        System.out.println("랜덤 주사위의 합계 : " + sum);
        System.out.println("프로그램 종료");
    }
    
    public static void main(String[] args) {
        randomDice();
    }
}
