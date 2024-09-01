package exception.ex3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) {
        // V3_1을 사용해, 예외를 나누어 발생한 예외에 따라 다른 오류가 발생하는 것을 확인
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
    // 실행 결과를 보면 ConnectExceptionV3, SendExceptionV3가 각각 다른 오류 메세지를 출력하는 것을 알 수 있다.
    // 즉, 계층을 통해 나누어 둔 예외가 발생한 예외에 맞게 적용되는 것이다.
}
