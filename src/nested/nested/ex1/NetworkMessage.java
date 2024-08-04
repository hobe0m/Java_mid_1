package nested.nested.ex1;

// Network 객체 안에서만 사용할 클래스
public class NetworkMessage {
    // 정적 중첩 클래스의 활용

    private String content;

    // 네트워크 메세지 생성
    public NetworkMessage(String content) {
        this.content = content;
    }

    // 네트워크 메세지 출력
    public void print() {
        System.out.println(content);
    }
}
