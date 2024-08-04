package nested.nested.ex1;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();
        network.sendMessage("hello, java");

        // Network를 생성하고 network.sendMessage()를 통해 메세지를 전달
        // NetworkMain은 오직 Network 클래스만 사용하고 NetworkMessage 클래스는 전혀 사용하지 않는다.
        // NetworkMessage는 오직 Network 내부에서만 사용된다.

        // 이 패키지 구조를 처음 보는 두 클래스를 다 보기 전에는 Network와 NetworkMessage를 모두 사용해야 되나라는 생각이 들 수 있다.
    }
}
