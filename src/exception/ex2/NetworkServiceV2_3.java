package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

            // 예외 발생 시 무시
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }
    }

    // 하나의 try 안에 정상 흐름을 모두 담고, 예외 부분은 catch 블럭에서 해결한다.
    // 이렇게 하면 정상 흐름은 try 블럭에, 예외 흐름은 catch 블럭에 담겨 명확히 구분할 수 있다.
}
