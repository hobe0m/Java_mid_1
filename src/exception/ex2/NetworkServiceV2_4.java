package exception.ex2;

public class NetworkServiceV2_4 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());

            client.disconnect();
        }
        // disconnect()를 호출해서 연결을 해제해야 했던 문제를 해결
        // 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않으므로 외부 자원을 사용했다면 연결을 해제해서 외부 자원을 반납해야 한다.
    }
}
