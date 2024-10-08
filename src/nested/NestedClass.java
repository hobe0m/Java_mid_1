package nested;

public class NestedClass {
    // 중첩 클래스, 내부 클래스 1
    // 클래스 안에 클래스를 중첩해서 정의하는 것을 중첩 클래스(NestedClass)라 한다.

    // 중첩 클래스는 클래스를 정의하는 위치에 따라 분류(총 4가지, 크게 2가지로 분류)가 달라진다.

    // non-static, static으로 분류
    // 내부 클래스(non-static) : 바깥 인스턴스 소속
    // 정적 중첩 클래스(static) : 전혀 다른 인스턴스

    // 내부 클래스는 내부 클래스, 지역 클래스, 익명 클래스로 분류된다.
    //  - 내부 클래스(inner class)
    //  - 지역 클래스(local class) : 코드 블록에 선언
    //  - 익명 클래스(anonymous class) : 이름 없는 클래스

    // 중첩 클래스를 정의하는 위치는 변수의 선언 위치와 같다.
    // 변수의 선언 위치
    //  - 정적 변수(클래스 변수)
    //  - 인스턴스 변수
    //  - 지역 변수

    // 중첩 클래스의 선언 위치
    //  - 정적 중첩 클래스(정적 변수와 같은 위치)
    //  - 내부 클래스(인스턴스 변수와 같은 위치)
    //  - 지역 클래스(지역 변수와 같은 위치)

    // 이 때, 정적 중첩 클래스와 내부 클래스는 선언 위치는 같지만 정적 중첩 클래스는 static을 사용한다.
    // 지역 변수는 코드 블럭 내, 예를 들어 메서드 내에 정의된다.
    // 익명 클래스는 지역 클래스와 똑같지만 이름이 없는 특별한 버전이고, 뒤에 다시 설명한다.
    
    // 중첩과 내부의 차이
    // 중첩(Nested) : 어떤 다른 것이 내부에 위치하거나 포함되는 구조적인 관계
    // 내부(Inner) : 나의 내부에 있는 나를 구성하는 요소

    // 쉽게 이야기하면 여기서 의미하는 중첩은 나의 안에 있지만 나의 것이 아닌 것 즉, 단순히 위치만 안에 있는 것이다.
    // 반면에 여기서 의미하는 내부는 나의 내부에서 나를 구성하는 요소를 의미한다.

    // 정리하면 정적 중첩 클래스는 바깥 클래스의 안에 있지만 바깥 클래스와 관계 없는 전혀 다른 클래스를 말한다.
    // 내부 클래스는 바깥 클래스의 내부에 있으면서 바깥 클래스를 구성하는 요소를 말한다.
    //  - 사람의 심장을 생각하면 된다.

    // 분류의 핵심은 바깥 클래스 입장에서 볼 때 나의 안에 있는 클래스가 나의 인스턴스에 소속이 되는가 되지 않는가이다.
    //  - 정적 중첩 클래스는 바깥 클래스와 전혀 다른 클래스이기 때문에 바깥 클래스의 인스턴스에 소속되지 않는다.
    //  - 반면 내부 클래스는 바깥 클래스를 구성하는 요소이기 때문에 바깥 클래스의 인스턴스에 소속된다.

    // 정적 중첩 클래스 : static, 바깥 클래스 인스턴스 X
    // 내부 클래스 : static X, 바깥 클래스 인스턴스 O

    // 내부 클래스의 종류
    // 내부 클래스 : 바깥 클래스의 인스턴스 멤버에 접근
    // 지역 클래스 : 내부 클래스의 특징 + 지역 변수에 접근
    // 익명 클래스 : 지역 클래스의 특징 + 클래스의 이름이 없는 특별한 클래스

    // 용어 정리
    // 중첩 클래스 : 정적 중첩 클래스 + 내부 클래스 모두 포함
    // 정적 중첩 클래스 : 정적 중첩 클래스
    // 내부 클래스 : 내부 클래스, 지역 클래스, 익명 클래스를 포함해서 말한다.

    // 참고, 실무 용어
    // 실무에서는 중첩, 내부라는 단어를 명확히 구분하지 않고, 중첩 또는 내부 클래스라고 한다.
    // 왜냐면 클래스 안에 클래스가 있는 것을 중첩 클래스라고 하고, 내부 클래스 또한 중첩 클래스의 한 종류이기 때문이다.
    // 따라서 둘을 명확히 구분하지는 않기 때문에 상황과 문맥에 따라 이해하면 된다.

    // 중첩 클래스의 사용 시기
    // 내부 클래스를 포함한 모든 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게 연결된 특별한 경우에만 사용한다.
    // 외부의 여러 클래스가 특정 중첩 클래스를 사용한다면 중첩 클래스로 만들면 안된다.

    // 중첩 클래스의 사용 이유
    // 논리적 그룹화
    //  - 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우 해당 클래스 안에 포함하는 것이 논리적으로 더 그룹화 된다.
    //  - 패키지를 열었을 때 다른 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는 장점 또한 포함한다.

    // 캡슐화
    //  - 중첩 클래스는 바깥 클래스의 private 멤버에 접근할 수 있다.
    //  - 이렇게 해서 둘을 긴밀하게 연결하고 불필요한 public 메서드를 제거할 수 있다.
    //  - 이 부분은 추후에 예제를 통해 더 자세히 알아보도록 한다.

}
