package exception.basic.unchecked;

public class Client {
    public void call() {
        // 언체크 예외는 발생한 예외를 명시적으로 던지지 않아도 자동으로 외부로 던진다.
        throw new MyUncheckedException("error");
    }
}
