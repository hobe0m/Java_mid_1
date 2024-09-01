package exception.ex3.exception;

public class NetworkClientExceptionV3 extends Exception {

    // 예외 계층
    // 예외를 단순히 오류 코드로 분류하는 것이 아니라 예외를 계층화해서 다양하게 만드는 것
    //  - 더 세밀하게 예외를 처리할 수 있다는 장점이 있다.

    // Exception - NetworkClientException - ConnectException - SendException 등으로 나누는 것
    // Exception(제일 상위), NetworkClientException(Exception의 자식), ConnectException, SendException(NetworkClientException의 자식, Exception의 손자)

    // 즉, NetworkClientExceptionV3는 NetworkClient에서 발생하는 모든 예외의 부모이다.
    // 또한 NetworkClient에서 연결 실패 시에는 ConnectException이, 전송 실패 시에는 SendException이 발생한다.
    // ConnectException과 SendException은 각각 내부에 연결을 시도한 address와 전송을 시도한 데이터인 sendData를 보관한다.

    // 이렇게 예외를 계층화하면 여러 장점이 생긴다.
    // 자바에서 예외는 객체이므로 부모 예외를 잡거나 던지면 자식 예외도 함께 잡거나 던져진다.
    // 이 때, 특정 예외만 처리하고 싶으면 하위 예외만 따로 잡아서 처리하면 된다.
    // 즉, 한꺼번에 처리, 각각 처리가 가능하다.

    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
