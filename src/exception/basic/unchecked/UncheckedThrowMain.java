package exception.basic.unchecked;

public class UncheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");

        // 던지기만 할 뿐 처리하지 않았기 때문에 예외가 발생한다.
    }
}
