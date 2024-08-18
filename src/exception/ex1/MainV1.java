package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();

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
    
    // "error1" 입력 시 서버 연결 실패, "error2" 입력 시 데이터 전송 실패
    // 남은 문제
    //  - 연결이 실패하면 데이터를 전송하지 않아야 하는데 여기서는 데이터를 전송한다.

    // 추가 요구 사항
    //  - 오류가 발생했을 때 어떤 오류가 발생했는 지 자세한 내역을 남기면 이후 디버깅에 도움이 되므로 오류 로그를 남긴다.
}