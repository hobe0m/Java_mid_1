package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    // 이전에는 NetworkClientException으로 묶어서 처리하던 예외를 Connect, Send로 구분해서 처리한다.
    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            throw new SendExceptionV3(data,address + " 서버에 데이터 전송 실패 : " + data);
            // throw new RuntimeException("Ex");
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
}

// 이렇게 예외 계층을 사용하면 오류 코드로 어떤 문제가 발생하는지 이해하는 것이 아니라 예외 그 자체로 어떤 오류가 발생했는지 알 수 있다.
// 연결 관련 오류가 발생하면 ConnectExceptionV3를 던지고, 전송 관련 오류가 발생하면 SendExceptionV3를 던진다.
