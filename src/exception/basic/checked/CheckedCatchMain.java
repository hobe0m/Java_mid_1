package exception.basic.checked;

public class CheckedCatchMain {
    // 예외를 잡아서 처리하는 코드
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }

    // service.callCatch()에서 예외를 처리했기 때문에 main()까지 예외가 올라오지 않는다.
    // 따라서 main()에서 출력하려고 하는 "정상 종료" 문구가 정상적으로 출력된 것을 알 수 있다.

    // 실행 순서 분석
    //  - 1. main() -> service.callCatch() client.call() [예외 발생, 던짐]
    //  - 2. main() <- service.callCatch() [예외 처리] client.call()
    //  - 3. main() [정상 흐름] <- service.callCatch() client.call()

    // 따라서 Client.call()에서 MyCheckedException 예외가 발생하고, 그 예외를 Service.callCatch()에서 잡는 것을 확인 할 수 있다.

    // 실행 결과를 통해 catch 부분이 작동한 것을 알 수 있고, catch로 예외를 잡아서 처리하고 나면 코드가 정상 흐름으로 작동한다는 것 또한 알 수 있다.

    // 예외를 잡아서 처리하려면 try ~ catch(..)를 사용해서 잡으면 되는데, 이 때 try 코드에서 발생하는 예외를 잡아 catch로 넘긴다.
    //  - 만약 try에서 잡은 에외가 catch의 대상에 없으면 예외를 잡을 수 없으므로 이 때는 에외를 밖으로 던져야 한다.
    //  - 여기서는 MyCheckedException 예외를 catch로 잡아서 처리한다.

    // catch는 해당 타입과 하위 타입 모두를 잡을 수 있다.
    // 만약 정확하게 잡고 싶다면 정확한 타입만 적어주면 된다.
    // 이는 예외도 객체이기 때문에 다형성이 적용되는 결과이다.
}
