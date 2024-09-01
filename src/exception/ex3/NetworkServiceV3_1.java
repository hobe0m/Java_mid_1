package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            // 연결 오류 잡기
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소 : " + e.getAddress() + ", 메세지 : " + e.getMessage());
            // 전송 오류 잡기
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터 : " + e.getSendData() + ", 메세지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }

    // 예외 클래스를 각각의 예외 상황에 맞추어 만들면, 필요에 맞는 예외를 잡아서 처리할 수 있다.
    // 예를 들면 getSendData(), getAddress() 등 각가그이 예외 클래스가 가지는 고유의 기능을 활용할 수 있다는 것이다.
    // catch (ConnectExceptionV3 e)은 연결 예외를 잡고, 해당 예외가 제공하는 기능을 사용해서 정보를 출력한다.
    // catch (SendExceptionV3 e)은 전송 예외를 잡고, 해당 예외가 제공하는 기능을 사용해서 정보를 출력한다.
}
