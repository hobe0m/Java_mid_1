package enumeration.ex3;

// 열거형, Enum Type
// 자바는 타입 안전 열거형 패턴(Type-Safe-Enum Pattern)을 매우 편리하게 사용할 수 있는 열거형(Enum Type)을 제공한다.
// Enum은 일련의 명명된 상수들의 집합을 쉽게 정의할 수 있고, 프로그래밍에서는 이러한 상수들을 사용하여 코드 내에서 미리 정의된 값들의 집합을 나타낸다.
// 자바의 Enum은 타입 안전성을 제공하고, 코드의 가독성을 높이며, 예상 가능한 값들의 집합을 표현하는 데 사용된다.
public enum Grade {
    BASIC, GOLD, DIAMOND
    // 열거형을 정의할 때는 class 대신에 enum을 사용한다.
    // 원하는 상수의 이름을 나열하면 된다.
}
