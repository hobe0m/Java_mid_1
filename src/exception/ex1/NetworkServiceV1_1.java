package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 에러를 유발하는 입력 값인지 확인하는 단계를 추가
        
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
