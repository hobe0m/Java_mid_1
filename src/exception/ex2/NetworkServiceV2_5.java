package exception.ex2;

public class NetworkServiceV2_5 {
    // finally
    //  - 어떤 경우라도 반드시 호출되는 코드
    //  - try ~ catch ~ finally의 순서로 사용한다.
    //  - 이는 정상 흐름(try), 예외 흐름(catch), 마무리 흐름(finally)으로 볼 수 있다.
    //  - 이 때, try를 시작하기만 하면 finally 코드 블럭은 무조건 호출되고, 심지어는 잡을 수 없는 예외가 발생해도 finally는 호출된다.
    //  - finally는 반드시 호출되므로 주로 try에서 사용한 자원을 해제할 때 많이 사용한다.
    //  - 예외가 던저질 경우에는 finally를 호출한 뒤에 밖으로 던져진다.
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }

        // finally를 사용하여 연결 해제가 필수적으로 이루어지도록 한다.
        // 아까 언급했던 것처럼, catch에서 잡을 수 없는 예외가 발생해 밖으로 던지는 경우에도 finally를 먼저 호출하고 그 뒤에 예외를 밖으로 던진다.

        // 참고
        // catch없이 try와 finally만 사용할 수도 있다.
        // 예외를 직접 잡아서 처리할 일이 없을 때 사용한다.
        // 마찬가지로 이 때도 finally의 호출이 보장된다.

        // 정리
        // 자바 예외 처리는 try ~ catch ~ finally의 구조를 사용해 처리할 수 있으며 다음과 같은 이점이 생긴다.
        //  - 정상 흐름과 예외 흐름을 분리해 코드를 읽기 쉽게 만든다.
        //  - 사용한 자원을 항상 반환할 수 있도록 보장해준다.
    }
}
