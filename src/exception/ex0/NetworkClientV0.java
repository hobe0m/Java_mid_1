package exception.ex0;

public class NetworkClientV0 {
    
    // 실제로 외부 네트워크에 접속하는 코드는 없지만, 외부 네트워크에 접속한다고 가정
    // 네트워크 클라이언트는 기능들을 제공하고, 그것들을 제어하는 것이 네트워크 서비스이다.
    
    // address : 접속할 외부 서버 주소
    // connect() : 외부 서버에 연결
    // send(String data) : 연결한 외부 서버에 데이터를 전송
    // disconnect() : 외부 서버의 연결을 해제
    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    public String connect() {
        // 연결 성공
        System.out.println(address + "서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }
    
    public void disconnect() {
        System.out.println(address + "서버 연결 해제");
    }
}
