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
        }
        // 여기에 client.disconnect()를 추가함으로써 예외가 있던 없던 disconnect()를 무조건 호출하게끔 설정
        client.disconnect();

        // 하지만 catch에서 잡을 수 없는 문제가 발생할 경우에는 다시금 문제가 생긴다.
        // 잡을 수 없는 문제가 발생하면 disconnect가 호출되지 않고, 잡을 수 없는 예외에 대한 오류가 발생한다.
        // 여기서는 send(data)에서 발생한 예외를 처리하지 못해 프로그램이 종료되고 스택 트레이스를 띄운다.

        // disconnect()를 호출해서 연결을 해제해야 했던 문제를 해결
        // 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않으므로 외부 자원을 사용했다면 연결을 해제해서 외부 자원을 반납해야 한다.

        // 사용 후에 무조건 disconnect()를 통해 연결 해제를 보장하는 것은 쉽지 않다.
        // 정상적인 상황, 예외 상황 그리고 어디선가 모르는 예외를 밖으로 던지는 상활까지 고려해야 하기 때문이다.
        // 앞서 보았듯 지금과 같은 구조로는 항상 disconnect(0를 호출하는 것이 매우 어렵고 실수로 놓칠 가능성이 크기에 대안이 필요하다.
    }
}
