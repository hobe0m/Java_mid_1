package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        // NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
        try {
            networkService.sendMessage(input);
            // networkService.sendMessage(input);에서 발생하는 예외를 catch (Exception e)를 통해 모두 잡는다.
            // catch로 잡는 순간 예외는 복구가 된다.
            // 여기서 예외가 복구되므로 다시금 반복된다.
        } catch (Exception e) {
            exceptionHandler(e);
        }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외를 처리하는 부분
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");

        // 사용자가 보지 못하게 해야 한다.
        // 파일에 남겨지는 등 다른 방법 사용
        System.out.println("== 개발자용 디버깅 메세지 ==");
        
        // 스택 트레이스 출력, 어떤 문제가 발생했는 지 빠르게 확인
        e.printStackTrace(System.out);
        // e.printStackTrace();

        // 필요하면 예외 별로 별도의 추가 처리 가능
        // 공통 처리를 하지만 전송 오류일 경우에는 다르게 처리하고 싶을 때 이와 같이 처리할 수 있다.
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
