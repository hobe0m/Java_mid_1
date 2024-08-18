package exception.basic.checked;

// 자바 예외 처리, 체크 예외
//  - Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외이다.
//   - 단, RuntimeException은 예외로 한다.
//  - 체크 예외는 잡아서 처리하거나 또는 밖으로 던지도록 선언해야 하며 그렇지 않으면 컴파일 오류가 발생한다.

// 예외 클래스를 만들려면 예외를 상속받으면 된다.
// Exception을 상속 받은 예외는 체크 예외가 된다.
//  - 체크 예외는 컴파일 타임에 예외 처리가 강제된다.
//  - 즉, 실행 전 예외 처리가 필수이다.

// 참고로 RuntimeException을 상속받으면 언체크 예외가 된다.
//  - 이런 규칙은 자바 언어에서 문법으로 정한것이다.

// 예외가 제공하는 기본 기능이 있는데, 그 중에 오류 메세지를 보관하는 기능도 있다.
//  - 예제처럼 생성자를 통해 해당 기능을 그대로 사용하면 편리하다.

public class MyCheckedException extends Exception {
    
    // 생성자 생성
    // 예외(오류) 메세지를 부모인 Throwable에 보관(Throwable은 String detailMessage를 필드로 가진다.)
    // 예외가 터지면 보통 왜 그런 예외가 발생했는지 알려줘야 하기 때문에 메세지를 가지는 것이다.
    // 해당 메세지는 getMessage()로 조회할 수 있다.
    public MyCheckedException(String message) {
        super(message);
    }
}
