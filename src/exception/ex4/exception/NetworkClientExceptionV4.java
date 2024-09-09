package exception.ex4.exception;

// 지금까지 실습한 내용을 언체크 예외로 만들고, 해결할 수 없는 예외들을 공통 처리하기
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
