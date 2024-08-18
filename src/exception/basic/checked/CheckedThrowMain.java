package exception.basic.checked;

public class CheckedThrowMain {
    // 예외를 처리하지 않고, 밖으로 던지는 코드
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        // 예외가 해결이 안되서 main() 메서드 밖으로 나갔다.
        // 따라서 예외를 해결하지 못했기에, 아래의 코드는 실행되지 않는다.
        // 예외 메세지와, 경로가 나타난다.
        service.catchThrow();
        System.out.println("정상 종료");
    }

    // 실행 결과
    //  - Service.callThrow() 안에서 예외를 처리하지 않고, 밖으로 던졌기 때문에 예외가 main() 메서드까지 올라온다.
    //  - main()의 service.callThrow()를 호출하는 곳에서 예외를 잡아서 처리하지 못했기 때문에 여기서 예외가 main() 밖으로 던져진다.
    //  - 따라서 main()에 있는 service.callThrow() 메서드 다음에 있는 "정상 종료"가 출력되지 않는다.
    //  - 예외가 main() 밖으로 던져지면 예외 정보와 스택 트레이스(Stack Trace)를 출력하고 프로그램이 종료된다.
    //   - 스택 트레이스 정보를 활용하면 예외가 어디서 발생했는지, 그리고 어떤 경로를 거쳐서 넘어왔는지 확인할 수 있다.

    // 실행 순서
    // 1. main() -> service.callThrow() client.call() [예외 발생, 던짐]
    // 2. main() <- service.callThrow() [예외 던짐] client.call()
    // 3. main() [예외 던짐] <- service.callThrow() client.call()

    // 체크 예외를 처리할 수 없는 경우에는 throws 키워드를 사용해서, method() throws 예외와 같이 밖으로 던질 예외를 필수로 지정해주어야 한다.

    // 예외가 발생했을 때는 스택 트레이스와 메세지를 통해 위치와 이유를 알아야 한다.

    // 체크 예외를 처리하거나 던지지 않았을 경우 컴파일 오류가 발생한다.

    // 참고로 체크 예외를 밖으로 던지는 경우에도 해당 타입과 그 하위 타입을 모두 던질 수 있다.
    // 만약 손자 클래스에서 상위 타입의 예외를 던졌다면 자식 클래스에서는  던진 타입과 동일하거나 더 높은 타입으로 던져야 한다.

    // 체크 예외의 장단점
    // 체크 예외는 예외를 잡아서 처리할 수 없을 때, 예외를 밖으로 던지는 throws 예외를 필수로 선언해야 한다.
    // 그렇지 않으면 컴파일 오류가 발생하기 때문이다.
    // 이러한 점 때문에 체크 예외의 장단점이 동시에 존재하게 된다.
    //  - 장점 : 개발자가 실수로 예외를 누락하지 않도록 컴파일러를 통해 문제를 잡아주는 안전 장치이기 때문에 개발자는 어떤 체크 예외가 발생하는 지 쉽게 파악할 수 있다.
    //  - 단점 : 하지만 실제로는 개발자가 모든 체크 예외를 반드시 잡거나 던지도록 처리해야 하기 때문에, 너무 번거로워지며 크게 신경쓰고 싶지 않은 예외까지 모두 챙겨야 한다.

    // 정리
    // 체크 예외는 잡아서 직접 처리하거나 또는 밖으로 던지거나 둘 중 하나를 개발자가 직접 명시적으로 처리해야 하며 그렇지 않으면 컴파일 오류가 발생한다.
}
