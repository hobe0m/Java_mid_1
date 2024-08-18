package exception;

public class ExceptionHierarchy {
    // 자바 예외 처리, 예외 계층
    // 자바는 프로그램 실행 중에 발생할 수 있는 예상치 못한 상황 즉, 예외(Exception)을 처리하기 위한 매커니즘을 제공한다.
    // 이는 프로그램의 안정성과 신뢰성을 높이는 데 중요한 역할을 한다.

    // 자바의 예외 처리는 다음 키워드를 사용한다.
    // try, catch, finally, throw, throws

    // 그리고 예외를 다루기 위한 예외 처리용 객체들을 제공한다.

    // 예외 계층도

    // Object : 자바에서 기본형을 제외한 모든 것은 객체이므로 예외도 객체이다.
    //  - 모든 객체의 최상위 부모는 Object이므로 예외의 최상위 부모도 Object이다.

    // Throwable : 최상위 예외이며, 하위에 Exception(왼쪽)과 Error(오른쪽)가 있다.

    // Error : 메모리 부족이나 심각한 시스템 오류와 같이 애플리케이션에서 복구가 불가능한 시스템 예외이다.
    //  - 하위에 OutOfMemoryError가 있다.
    //  - 애플리케이션 개발자는 이 예외를 잡으려고 해서는 안된다.
    //  - 시스템 상 오류이므로 애플리케이션 개발자가 해결할 수 없는 범위이다.

    // Exception : 애플리케이션 로직에서 사용할 수 있는 실질적인 최상위 예외이며, Exception과 그 하위 예외는 모두 컴파일러가 체크하는 체크 예외이다.
    //  - 단, RuntimeException은 예외로 한다.
    //  - 하위에는 RuntimeException, SQLException, IOException이 존재한다.
    
    // RuntimeException : 언체크 예외, 런타임 예외
    //  - 하위에는 NullPointerException, IllegalArgumentException이 존재한다.
    //  - 컴파일러가 체크 하지 않는 언체크 예외이다.
    //  - RuntimeException과 그 자식 예외는 모두 언체크 예외이다.
    //  - RuntimeException의 이름을 따라서 RuntimeException과 그 하위 언체크 예외들을 런타임 예외라고 많이 부른다.

    // 체크 예외 vs 언체크 예외(런타임 예외)
    // 체크 예외는 발생한 예외를 개발자가 명시적으로 처리해야 하고 그렇지 않으면 컴파일 오류가 발생한다.
    // 반면에 언체크 예외는 개발자가 발생한 예외를 명시적으로 처리하지 않아도 된다.
    
    // 주의
    // 상속 관계에서 부모 타입은 자식을 담을 수 있다.
    // 이 개념은 예외 처리에도 적용되는데, 상위 예외를 catch로 잡으면 그 하위 예외까지 함께 잡는다.
    // 따라서 애플리케이션 로직에서는 Throwable 예외를 잡으면 안된다.
    //  - 앞서 이야기 했던 잡으면 안되는, 잡을 수 없는 Error 예외도 함께 잡을 수 있기 때문이다.
    // 따라서 애플리케이션 로직은 이러한 이유로 Exception부터 필요한 예외로 생각하고 잡으면 된다.

    // 상위 예외부터 하위 예외까지
    // Object
    // Throwable
    // Exception - SQLException, IOException, RuntimeException(NullPointerException, IllegalArgumentException)
    // Error - OutOfMemoryError
}
