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
    // 공통 예외 처리
    // 여기에는 예외를 공통으로 처리하는 부분이 존재한다.

    // exceptionHandler()를 통해 사용자에게 알리고, 개발자에게 오류 메세지(디버깅을 위함)를 남긴다.
    // 예외도 객체이므로 필요하면 instanceof를 사용해 예외 객체의 타입을 확인해서 별도의 추가 처리를 할 수 있다.

    // e.printStackTrace()
    //  - 예외 메세지와 스택 트레이스를 출력할 수 있다.
    //  - 이 기능을 사용하면 예외가 발생한 지점을 역으로 추적할 수 있다.
    //  - 참고로 예제에서는 e.printStackTrace(System.out)를 사용해서 표준 출력으로 보냈다.
    //   - IDE에서 빨간색이 아닌 그냥 하얀색으로 출력
    //  - e.printStackTrace(), e.printStackTrace(System.err)를 사용하면 표준 오류의 결과를 출력한다.
    //   - IDE에서 빨간색으로 출력 결과를 보여주고 일반적으로 이 방법을 사용한다.
    //   - System.err를 생략해도 기본값이기 때문에 표준 오류로 출력한다.

    // 참고
    // System.out, System.err 둘 다 결국 콘솔에 출력되지만 서로 다른 흐름을 통해 출력되므로 둘을 함께 사용하면 출력 순서를 보장하지 않아 순서가 꼬여서 보일 수 있다.

    // 참고
    // 실무에서는 System.out이나 System.err를 통해 콘솔에 무언가를 출력하기 보다는 주로 Slf4J, logback 같은 별도의 로그 라이브러리를 사용해서 콘솔과 특정 파일에 함께 결과를 출력한다.
    // 그런데 e.printStackTrace()를 직접 호출하면 결과가 콘솔에만 출력되고 이렇게 되면 서버에서 로그를 확인하기 어려워진다.
    // 서버에서는 파일로 로그를 확인해야 하므로 e.printStackTrace()를 많이 사용하지 않고 대신 로그 라이브러리를 통해 예외 스택 트레이스를 출력한다.
    // 지금은 로그 라이브러리가 있다는 것만 알아두면 되고, 또한 학습 단계이므로 e.printStackTrace()를 적극 사용해도 괜찮다.

    // 실행 결과를 보면 공통 예외 처리가 잘 적용된 것을 확인할 수 있고, "error2"의 경우에는 SendError이므로 추가적인 처리가 되는 것도 확인할 수 있다.

    // 참고
    // 최근 만들어진 라이브러리는 대부분 언체크 예외를 사용해 해결할 수 있는 예외는 잡아서 처리하고, 나머지 예외들은 공통으로 하나로 묶어 한번에 처리하는 방식을 사용한다.
}
