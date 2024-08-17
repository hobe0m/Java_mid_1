package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

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

    // 전송할 문자를 Scanner를 통해 입력 받는다.
    // NetworkService.sendMessage()를 통해 메세지를 전달한다.
    // exit를 입력하면 프로그램을 정상 종료한다.
}
