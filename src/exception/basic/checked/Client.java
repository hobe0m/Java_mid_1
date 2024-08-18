package exception.basic.checked;

public class Client {
    // 메서드 옆 throws MyCheckedException을 통해 해당 예외를 처리하지 못해 던질 것이라는 것을 명시
    public void call() throws MyCheckedException {
        // 문제 상황 발생
        throw new MyCheckedException("error");
    }

    // "throw 예외" 라고 하면 새로운 예외를 발생시킬 수 있다.
    // 이 때, 예외도 객체이기 때문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.
    // "throws 예외" 는 발생시킨 예외를 메서드 밖으로 던질 때 사용하는 키워드이다.
    // 따라서 throw는 예외 발생, throws는 예외 던짐이라는 차이가 있다.
    // 또한 throws 옆에 붙는 예외는 throw로 생성한 예외와 동일하거나 상위에 있어야 한다.
}
