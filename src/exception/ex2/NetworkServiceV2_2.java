package exception.ex2;

public class NetworkServiceV2_2 {
    // 예외 복구
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            // connect()에서 오류가 발생하면, 오류 코드와 오류 메세지를 출력하고 프로그램을 중지시킨다.
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
    // connect(), send()같이 예외가 발생할 수 있는 곳에서 try ~ catch를 사용해서 NetworkClientExceptionV2 예외를 잡았다.
    // 예외를 잡으면 오류 코드와 오류 메세지를 출력하게끔 설계했다.
    // 여기서는 이렇게 예외를 잡아서 처리했기 때문에 이후에는 정상 흐름으로 복귀한다.
    // 만약 예외를 잡았을 경우에는 return을 사용해 메서드를 빠져나간다.

    // 해결된 문제
    // 예외를 잡아서 처리(try ~ catch)했기 때문에 예외가 복구되고 프로그램도 계속 수행할 수 있다.

    // 남은 문제
    // 예외 처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어 코드를 읽기 어렵다.
    // 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다.
}

