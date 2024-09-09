package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패 : " + data);
        }
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    @Override
    public void close() {
        // try가 끝나면 자동으로 실행되는 자원 반납 메서드
        // 따라서 자원 반납 시 어떤식으로 출력하고 어떤 메서드를 사용할 지 넣어주면 된다.
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
    // implements AutoCloseable을 통해 autoCloseable을 구현한다.
    // close() : AutoCloseable 인터페이스가 제공하는 이 메서드는 try가 끝나면 자동으로 호출된다.
    // 종료 시점에 자원을 반납하는 방법을 여기에 정의하면 된다.
    // 참고로 이 메서드에서 예외를 던지지는 않으므로 인터페이스의 메서드에 있는 throws Exception은 제거했다.

    // 애플리케이션에서 외부 자원을 사용하는 경우 반드시 외부 자원을 해제해야 한다.
    // 따라서 finally 구문을 반드시 사용해야 한다.

    // try에서 외부 자원을 사용하고, try가 끝나면 외부 자원을 반납하는 패턴이 반복되면서 자바에서는 try with resources라는 편의 기능을 자바 7에서 도입했다.
    // 이름 그대로 try에서 자원을 함께 사용한다는 뜻이다.
    // 여기서 자원은 try가 끝나면 반드시 종료해서 반납해야 하는 외부 자원을 뜻한다.

    // 이 인터페이스를 구현하면 Try with resources를 사용할 때 try가 끝나는 시점에 close()가 자동으로 호출된다.

    // try (Resource resource = new Resource()) {
    //     리소스를 사용하는 코드
    // }

    // 이런 식으로 try with resources 구문을 사용하면 된다.

    // try with resources는 AutoCloseable을 구현하고 있을 때만 사용할 수 있다.
}