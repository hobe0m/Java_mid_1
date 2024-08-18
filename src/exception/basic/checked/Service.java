package exception.basic.checked;

public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드
    public void callCatch() {
        // 클라이언트에서 터진 예외가 서비스로 날아옴
        // try - catch문으로 예외를 잡는다.
        try {
            client.call();
        } catch (MyCheckedException e) {
            // 예외 처리 로직(폭탄 해체)
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    // 체크 예외를 밖으러 던지는 코드
    // 체크 예외는 예외를 잡지 않고 밖으로 던지려면, throws 예외를 메서드에 필수로 선언해야 한다.
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
