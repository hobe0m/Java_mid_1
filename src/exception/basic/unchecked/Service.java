package exception.basic.unchecked;

public class Service {
    // Unchecked 예외는 예외를 잡거나,  던지지 않아도 된다.
    // 예외를 잡지 않으면 자동으로 밖으로 던진다.

    Client client = new Client();

    // 필요한 경우 예외를 잡아서 처리할 수 있다.
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    // 예외를 잡지 않아도 된다.
    // 자연스럽게 상위로 넘어가기 때문이다.
    // 체크 예외와 다르게 throws 예외 선언을 하지 않아도 된다.
    // 말 그대로 컴파일러가 이런 부분을 체크하지 않기 때문에 언체크 예외이다.
    public void callThrow() {
        client.call();
    }

    // 체크와 언체크는 다 똑같지만, 처리하지 않았을 경우 자동으로 밖으로 던진다는 점만 다르다.

    // 참고로 언체크 예외도 throws 예외를 선언해도 된다.
    // 언체크 예외는 주로 생략하지만, 중요한 예외의 경우 이렇게 선언해두면 해당 코드를 호출하는 개발자가 이런 예외가 발생한다는 점을 IDE를 통해 좀 더 편리하게 인지할 수 있다.
    //  - 언체크 예외를 던진다고 선언한다고 해서 체크 예외처럼 컴파일러를 통해서 체크할 수 있는 것은 아니다.
    //  - 그저 해당 메서드를 호출하는 개발자가 IDE를 통해 호출 코드를 보고, 이런 예외가 발생한다고 인지할 수 있는 정도이다.
}

