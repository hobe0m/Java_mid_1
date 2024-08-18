package exception.ex1;

public class NetworkClientV1 {
    // 예외 처리가 필요한 이유
    //  - 오류 상황 만들기

    // 외부 서버와 통신할 때는 다양한 문제들이 발생한다.
    //  - 외부 서버와 연결에 실패(네트워크 오류 등)한다.
    //  - 데이터 전송에 문제가 발생한다.

    // 오류 상황을 시뮬레이션 하기 위해 사용자의 입력 값을 활용한다.
    // 연결 실패 : 사용자가 입력하는 문자에 "error1"이라는 단어가 있으면 연결에 실패하고, 오류 코드는 "connectError"로 한다.
    // 전송 실패 : 사용자가 입력하는 문자에 "error2"이라는 단어가 있으면 연결에 실패하고, 오류 코드는 "sendError"로 한다.

    // final이 붙은 변수는 생성 시 값을 할당하거나, 생성자에서 값을 할당해야 한다.
    // 이는 한번 생성하고 불변성을 보장하기 위함이다.
    private final String address;

    // 시뮬레이션 하기 위해 만든 필드
    public boolean connectError;

    // 시뮬레이션 하기 위해 만든 필드
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        // 연결 실패
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";

        // 연결 성공
        } else {
            System.out.println(address + "서버 연결 성공");
            return "success";
        }
    }

    public String send(String data) {
        // 전송 실패
        if (sendError) {
            System.out.println(address + "서버에 데이터 전송 실패 : " + data);
            return "sendError";
        // 전송 성공
        } else {

            System.out.println(address + " 서버에 데이터 전송 : " + data);
            return "success";
        }
    }

    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }

    
    // 에러가 발생하는 조건을 설정
    public void initError(String data) {
        // 문자열.contains(찾고 싶은 문자열 or 문자)를 하면 문자열 내에 찾고 싶은 문자 혹은 문자열이 있는 지 확인한다.
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    // 해당 클래스에는 connectError, sendError 필드가 있다.
    //  - connectError : 이 필드의 값이 true가 되면 연결에 실패, connectError 오류를 반환
    //  - sendError : 이 필드의 값이 true가 되면 데이터 전송에 실패, sendError 오류를 반환
    //  - 문제가 없으면 success를 반환

    // initError(String data)
    //  - 이 메서드를 통해서 connectError, sendError 필드의 값을 true로 설정할 수 있다.
    //  - 사용자 입력 값에 "error1"이 있으면 connectError 오류가 발생하고, "error2"가 있으면 sendError 오류가 발생한다.
}
