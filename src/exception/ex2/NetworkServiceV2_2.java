package exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();;
        } catch (NetworkClientExceptionV2 e) {
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
    // 해결된 문제
    // 예외를 잡아서 처리했기 때문에 예외가 복구되고 프로그램도 계속 수행할 수 있다.

    // 남은 문제
    // 예외 처리를 했지만 정상 흐름과 예외 흐름이 섞여 있어 코드를 읽기 어렵다.
    // 사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다.
}

