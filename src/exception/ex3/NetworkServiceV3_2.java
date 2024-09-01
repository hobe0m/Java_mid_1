package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {
    // 예외 계층의 활용
    // 예외를 잡아서 처리할 때 예외 계층을 활용하는 방법
    // 만약 NetworkClientV3에서 수 많은 예외가 발생한다고 가정했을 때 모든 예외를 하나하나 다 잡아서 처리하는 것은 상당히 번거롭다.
    // 따라서, 중요한 연결 오류를 제외하고 나머지 예외는 단순하게 처리한다.
    //  - 연결 오류, 알 수 없는 오류로 구분해서 출력
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
            // 나머지 오류 잡기
            // 연결 오류도 NetworkClientExceptionV3의 자식이지만, 위에서 먼저 걸러지므로 영향을 받지 않는다.

        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지 : " + e.getMessage());

            // 모르는 오류 잡기, NetworkClientExceptionV3로 잡을 수 없는 오류 잡기
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메세지 : " + e.getMessage());
        }
        finally {
            client.disconnect();
        }
    }
}
