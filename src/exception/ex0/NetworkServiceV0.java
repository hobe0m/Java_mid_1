package exception.ex0;

public class NetworkServiceV0 {
    // 네트워크 서비스는 클라이언트가 가진 기능들을 관리해준다.
    //  - 언제 사용하고, 언제 종료할 지 등을 컨트롤한다.

    // 복잡한 클라이언트의 사용 로직을 처리한다.
    // 따라서 클라이언트를 생성하고, 이 때 접속할 외부 서버 주소도 함께 전달한다.
    // 클라이언트를 사용하는데 필요한 connect(), send(), disconnect()를 순서대로 호출한다.

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
