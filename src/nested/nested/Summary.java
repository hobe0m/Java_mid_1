package nested.nested;

public class Summary {
    // 중첩 클래스 정리
    
    // 분류
    // static : 정적 중첩 클래스(static nested class)
    // non-static : 내부 클래스(inner class), 지역 클래스(local class), 익명 클래스(anonymous class)
    //  - 지역 클래스는 코드 블럭에 선언, 익명 클래스는 말 그대로 이름이 없는 클래스이다.
    //  - 또한 내부 클래스, 지역 클래스, 익명 클래스는 바깥 클래스의 인스턴스 소속이지만, 정적 중첩 클래스는 전혀 다른 인스턴스이다.
    
    // 정적 중첩 클래스는 바깥 클래스와 밀접한 관련이 있지만, 인스턴스 간에 데이터 공유가 필요 없을 때 사용
    // 내부 클래스는 바깥 클래스의 인스턴스와 연결되어 있고, 바깥 클래스의 인스턴스 상태에 의존하거나 강하게 연관된 작업을 수행할 때 사용

    // 지역 클래스
    //  - 내부 클래스의 특징을 가진다.
    //  - 지역 변수에 접근할 수 있고 이 때, 접근하는 지역 변수는 final 이거나 사실상 final 이어야 한다
    //  - 주로 특정 메서드 내에서만 간단히 사용할 목적으로 사용한다.

    // 익명 클래스
    //  - 지역 클래스인데, 이름이 없다.
    //  - 상위 타입을 상속 또는 구현하면서 바로 생성된다.
    //  - 주로 특정 상위 타입을 간단히 구현해서 일회성으로 사용할 때 유용하다.

    // 내부 클래스는 바깥 클래스의 인스턴스를 알아야 생성할 수 있으므로 바깥 클래스의 인스턴스 참조.new 내부 클래스로 생성한다.
    //  - 개념 상 바깥 클래스의 인스턴스 내부에서 내부 클래스의 인스턴스가 생성되기 때문이다.
    //  - 이 때, 개념 상이라는 말과 같이 실제로 내부 인스턴스가 바깥 인스턴스의 안에 생성되는 것은 아니고, 내부 인스턴스가 바깥 인스턴스의 참조를 보관해놓고 사용한다.


}