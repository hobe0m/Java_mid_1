package exception.ex3.exception;

public class ConnectExceptionV3 extends NetworkClientExceptionV3 {
    
    // 어느 서버의 연결에 실패했는지 확인하는 주소를 가진다.
    private final String address;

    // ctrl + shift + alt + 화살표 : 매개 변수의 위치 변경
    public ConnectExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // 연결에 실패했을 때 발생하는 예외, 내부에 연결을 시도했던 address를 보관
    // NetworkClientExceptionV3를 상속받는다.
}
