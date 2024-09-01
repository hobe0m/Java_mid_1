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
    // 이 때, 순서를 바꾸게 되면 문제가 발생한다.
    // 거름망이라고 생각하면 쉬운데, 연결 오류가 중요한 경우에 NetworkClientExceptionV3로 먼저 걸러버리면 네트워크 오류가 발생하고, ConnectExceptionV3는 아무 역할을 할 수 없게 된다.
    //  - 즉, 부모가 앞에 있으면 먼저 잡히기 때문에 디테일한 예외를 잡을 수 없다.

    // 참고
    // 여러 예외를 한번에 잡는 기능
    // |를 사용해서 여러 예외를 한번에 잡을 수 있다.
    // 즉 catch (ConnectExceptionV3 | SendExceptionV3 e)의 경우 두 가지 예외를 한번에 잡을 수 있고 이 때, 예외들이 공통으로 가지는 부모의 기능만 사용할 수 있다.

    // 정리
    // 예외를 계층화하고 다양하게 만들면 더 세밀한 동작들을 깔끔하게 처리할 수 있다.
    // 그리고 특정 분류의 공통 예외들도 한번에 catch로 잡아서 처리할 수 있다.
}
