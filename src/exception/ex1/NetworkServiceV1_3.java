package exception.ex1;

public class NetworkServiceV1_3 {
    // disconnect()까지 반드시 호출하도록 코드 작성
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        // 프로그램에서 return문을 제거하고 if문으로 적절하게 나누었다.
        // connect()에 성공해서 오류가 없는 경우에만 send()를 호출한다.
        // 중간에 return하지 않으므로 마지막에 있는 disconnect()를 호출할 수 있다.
        //  - 연결에 실패해도 disconnect()를 호출하고, 데이터 전송에 실패해도 disconnect()를 호출한다.
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }

        // 연결이 실패했을 때는 disconnect()를 안해도 되나요?
        //  - 여러 잔여물들이 남아 있을 수 있기 때문에 연결을 시도 했다면 해제하는게 깔끔하고 좋은 습관이다.
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
