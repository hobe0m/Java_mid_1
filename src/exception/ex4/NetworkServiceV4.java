package exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
    // NetworkServiceV4는 발생하는 예외인 ConnectExceptionV4, SendExceptionV4를 잡아도 해당 오류들을 복구할 수 없으므로 예외를 밖으로 던진다.
    // 마찬가지로 언체크 예외이므로 throws를 사용하지 않는다.
    // 사실 이런 경우 체크 예외가 아닌 언체크 예외여서, 해당 예외들을 생각하지 않고 던지는 것이 나은 선택일 수 있다.
    //  - 예외 복구가 불가능하고 해결할 수 없는 예외들은 다른 곳에서 공통으로 처리되기 때문이다.

    // 이런 방식을 사용해서 코드가 깔끔해진다.
    //  - 스스로의 코드에 더 집중할 수 있으므로(예외 생각 X)
}
