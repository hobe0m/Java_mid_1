package exception.ex2;

public class NetworkServiceV2_3 {
    // 정상 흐름과 예외 흐름의 분리
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            // 하나의 try 안에 정상 흐름을 모두 담는다.
            // 그리고 예외 흐름은 catch 블럭에서 해결한다.
            // 이렇게 해서 정상 흐름과 예외 흐름을 명확하게 분리한다.
            client.connect();
            client.send(data);

            // 예외 발생 시 무시
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }
    }
    // 이 때, try()의 connect()나 send(data)에서 예외가 발생하면 바로 catch로 넘어가 예외 처리 구문이 실행된다.
    // 이 전에는 try-catch를 따로 사용했기 때문에 return을 넣어 강제로 종료시켰다.

    // 하나의 try 안에 정상 흐름을 모두 담고, 예외 부분은 catch 블럭에서 해결한다.
    // 이렇게 하면 정상 흐름은 try 블럭에, 예외 흐름은 catch 블럭에 담겨 명확히 구분할 수 있다.
}
