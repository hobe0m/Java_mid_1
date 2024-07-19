package enumeration.ex2;

public class ClassRefMain {
    // ENUM 클래스
    // 타입 안전 열거형 패턴(Type-Safe Enum Pattern)
    // Enum은 Enumeration의 줄임말, 번역하면 열거(어떤 항목을 나열)
    // 타입 안전 열거형 패턴을 사용하면 나열한 항목만 사용할 수 있고, 그 외의 것은 사용할 수 없다.
    //  - 클래스를 정의 후, 해당 클래스와 동일한 타입만 사용할 수 있게 하고 클래스 안에 쓸 수 있는 항목을 나열
    //  - 이후 생성자를 private으로 막아 새로운 객체를 생성할 수 없게 하면 된다.

    // 타입 안전 열거형 패턴의 장점
    //  - 타입 안정성 향상 : 정해진 객체만 생성할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지할 수 있다.
    //  - 데이터 일관성 : 정해진 객체만 사용하므로 데이터의 일관성이 보장된다.

    // 조금 더 자세히
    //  - 제한된 인스턴스 생성 : 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고, 외부에서는 이 인스턴스들만 사용할 수 있도록 하여 미리 정의된 값들만 사용하도록 보장
    //  - 타입 안정성 :  이 패턴을 사용하면, 잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있는데 그 이유는 특정 메서드가 특정 열거형 타입의 값을 요구한다면, 오직 그 타입의 인스턴스만 전달할 수 있기 때문이다.

    // 단점
    // 이 패턴을 구현하려면 많은 코드를 작성해야 하고, private 생성자를 추가하는 등의 유의점이 있다.
    public static void main(String[] args) {
        System.out.println("class BASIC : " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD : " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND : " + ClassGrade.DIAMOND.getClass());

        System.out.println("ref BASIC : " + ClassGrade.BASIC);
        System.out.println("ref GOLD : " + ClassGrade.GOLD);
        System.out.println("ref DIAMONE : " + ClassGrade.DIAMOND);

        // 각각의 상수는 모두 ClassGrade 타입을 기반으로 인스턴스를 만들었기 때문에 getClass()의 결과는 모두 ClassGrade이다.
    }
}
