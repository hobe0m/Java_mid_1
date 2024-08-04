package nested.nested.ex2;

public class Network {
    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // 정적 중첩 클래스로 리팩토링
    public static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
    // NetworkMessage 클래스를 Network 클래스 안에 중첩해서 만들었다.
    // NetworkMessage의 접근 제어자를 private로 설정해 외부에서는 접근할 수 없다.

    // Network 관련 라이브러리를 사용하기 위해 ex2 패키지를 열어 본 개발자는 해당 클래스만 확인할 것이다.
    // 추가로 NetworkMessage가 중첩 클래스에 private 접근 제어자로 되어 있는 것을 보고, Network 내부에서만 단독으로 사용하는 클래스라고 바로 인지할 수 있다.
}
