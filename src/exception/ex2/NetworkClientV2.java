package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    // throws를 통해 발생한 예외를 내가 처리하지 않고 부모에게 던진다.
    // 또한 예외를 처리할 필요가 없기 때문에 return 값이 없는 void를 사용한다.
    // 이를 통해 반환값을 통해 성공 여부를 확인하던 저과 달리 메서드가 정상 종료면 성공, 예외가 던져지면 실패를 확인할 수 있게 되었다.
    // 만약 오류가 발생하면 NetworkClientExceptionV2를 생성해 오류의 코드와 메세지를 담는다.
    // 이후 객체를 throws를 통해 던진다.
    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            // 예외를 발생시킨다.
            // 체크 예외이므로 예외를 처리하지 않으면 컴파일 오류가 발생한다.
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        // 연결 성공 시
        System.out.println(address + " 서버 연결 성공");
    }

    // throws를 통해 발생한 예외를 내가 처리하지 않고 부모에게 던진다.
    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            // 예외를 발생시킨다.
            // 체크 예외이므로 예외를 처리하지 않으면 컴파일 오류가 발생한다.
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패 : " + data);
        }
        // 전송 성공 시
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
}

// 기존의 코드와 대부분 같지만, 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다.
// 따라서 반환 값을 사용하지 않아도 되며, 반환 값이 없는 void를 사용한다.
// 이전에는 반환 값으로 성공과 실패 여부를 확인해야 했지만, 예외 처리 덕분에 메서드가 정상 종료되면 성공이고 예외가 던져지면 예외를 통해 실패를 확인할 수 있다.
// 오류가 발생하면 예외 객체를 만들고 거기에 오류 코드와 오류 메세지를 담아두며 이 후 만든 예외 객체를 throw를 통해 던진다.