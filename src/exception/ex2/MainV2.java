package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        // NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        // NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
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
    // 자바의 스택 트레이스에는 에러가 발생한 경로와 메세지가 존재한다.
    // 따라서 에러 발생 시 스택 트레이스를 확인하는 것이 중요하다.

    // 모든 곳에서 에러를 잡지 않으면, 결과적으로 main() 밖으로 예외가 던져지고, 그렇게 되면 프로그램이 종료된다.
    //  - 이 때, 예외 메세지와 예외를 추적할 수 있는 스택 트레이스가 같이 출력된다.

    // V2_1
    // ServiceV2_1의 문제점
    // 예외 처리를 도입했지만 아직 예외가 복구되지는 않는다.
    //  - 즉, 예외가 발생하면 프로그램이 종료된다.

    // 사용 후에 반드시 disconnect()를 통해 연결을 해제해야 한다.

    // V2_2
    // ServiceV2_2가 해결한 것
    // 예외를 잡아서 처리했으므로 예외가 복구되고, 프로그램도 계속 수행할 수 있다.

    // ServiceV2_2의 문제점
    // 예외 처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어서 코드를 읽기 어렵다.

    // 사용 후에 반드시 disconnect()를 통해 연결을 해제해야 한다.
    
    // V2_3
    // ServiceV2_3가 해결한 것
    // 정상 흐름(try)과 예외 흐름(catch)을 명확하게 구분하였다.

    // ServiceV2_3의 문제점
    // 사용 후에 반드시 disconnect()를 통해 연결을 해제해야 한다.
}
