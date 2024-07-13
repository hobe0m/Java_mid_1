package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod(); // 상속받았으므로 사용 가능

        // toString()은 Object 클래스의 메서드
        String string = child.toString();
        System.out.println(string);
        // toString()은 객체에 대한 어떤 정보를 반환해주는 메서드이다.

        // java에서 Object 클래스가 최상위 부모 클래스인 이유
        //  - 공통 기능 제공
        //  - 다형성의 기본 구현

        // 공통 기능 제공
        // 객체의 정보를 제공하고, 이 객체가 다른 객체와 같은지 비교하고, 객체가 어떤 클래스로 만들어졌는지 확인하는 기능은 모든 객체에 필요한 기본 기능이다.
        // 따라서 계속해서 만들게 된다면 번거롭고 개발자마다 서로 다른 이름을 사용해 일관성이 없을 것이다.
        // 이러한 이유로 Object를 만들어 모든 객체에 필요한 공통 기능을 편리하게 제공한다.

        // Object가 제공하는 기능들
        //  - 객체의 정보를 제공하는 toString()
        //  - 객체의 같음을 비교하는 equals()
        //  - 객체의 클래스 정보를 제공하는 getClass()
        //  - 기타 여러가지 기능

        // 개발자는 모든 객체가 앞서 설명한 메서드들을 지원한다는 것을 알고 있으므로 프로그래밍이 단순화되고 일관성을 가진다.

        // 다형성의 기본 구현
        // 부모는 자식을 담을 수 있다.
        // Object는 모든 클래스의 무모이므로 모든 객체를 참조할 수 있다.
        //  - 이렇게 다형성을 지원하는 기본적인 매커니즘을 제공하는 것이다.
        // 모든 자바 객체는 Object 타입으로 처리될 수 있으며 이는 다양한 타입의 객체를 통합적으로 처리할 수 있게 해준다.
        // 쉽게 이야기해서 Object는 모든 객체를 다 담을 수 있으므로 타입이 다른 객체들을 어딘가에 보관해야 한다면 바로 Object에 보관하면 된다.
    }
}
