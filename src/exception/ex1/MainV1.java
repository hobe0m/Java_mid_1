package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        // NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        // NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

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

    // NetworkServiceV1_2를 사용하는 경우 문제 해결

    // NetworkClient 사용 시 주의 사항(문제 해결 정도 파악)
    //  - connect()가 실패한 경우 send()를 호출하면 안된다. -> 해결
    //  - 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다. -> 해결 안됨 *
    //   - connect(), send() 호출에 오류가 있어도 disconnect()는 반드시 호출해야 한다.

    // connect()가 실패한 경우 send()를 호출하면 안되는 부분은 해결되었다.
    // 하지만 사용 후 disconnect()를 반드시 호출해야 하는 문제는 해결되지 않았다.
    // error2를 보면 데이터 전송에 실패하지만 연결이 해제되지 않는다.
    //  - 연결은 계속 유지된 상태로 사라지지 않기 때문에 연결된 상태가 계속 생긴다.
    //  - 계속 이렇게 두면 네트워크 연결 자원이 고갈될 수 있다.

    // 참고
    // 자바의 경우 GC가 있기에 JVM 메모리에 있는 인스턴스는 자동으로 해제할 수 있지만 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않는다.
    // 따라서 외부 자원을 사용한 후에는 연결을 해제해서 외부 자원을 반드시 반납해야 한다.

    // V1_3을 사용하여, 연결 실패한 경우 메세지 전송 X, 사용 후 반드시 disconnect() 호출 O로 모두 해결하였다.
    
    // 정상 흐름과 예외 흐름
    // 그런데 반환 값으로 예욀르 처리하는 NetworkService1_2, NetworkService1_3은 정상 흐름과 예외 흐름이 전혀 분리되어 있지 않다.
    // 어떤 부분이 정상 흐름이고 어떤 부분이 예외 흐름인지 이해하기가 너무 어렵다.
    // 심지어 예외 흐름을 처리하는 부분이 더 많다.

    // 정상 흐름은 연결하고, 데이터를 전송하고, 연결을 종료하면 끝이다.
    //  - 매우 단순하고 직관적(NetworkServiceV1)이다.
    // 예외 흐름은 예외가 발생하는 순간 처리하기 위해 추가하는 코드들을 의미한다.
    // 즉, 정상 흐름은 프로그램이 예상대로 실행될 때의 흐름이고, 예외 흐름은 프로그램 실행 중에 예기치 않은 오류나 예외가 발생할 때 그것을 처리하는 흐름이다.

    // 정상 흐름과 예외 흐름이 섞이게 되면 코드를 한눈에 이해하기 어렵다.
    // 쉽게 이야기 해서 가장 중요한 정상 흐름이 눈에 잘 띄지 않게 된다.

    // 지금과 같이 반환 값을 사용해서 예외 상황을 처리하는 방식으로는 정상 흐름과 예외 흐름을 분리할 수 없다.
    // 이런 문제를 해결하기 위해 예외 매커니즘이 존재한다.

}