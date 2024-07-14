package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("강아지1,", 2);
        Dog dog2 = new Dog("강아지2,", 5);

        System.out.println("1. 단순 toString() 호출");
        System.out.println(car.toString()); // 오버라이딩 X
        System.out.println(dog1.toString()); // 오버라이딩 O
        System.out.println(dog2.toString()); // 오버라이딩 O

        System.out.println("2. println 내부에서 toString() 호출");
        // object(객체)를 넘겨도 toString() 메서드를 찾아서 사용
        System.out.println(car); // 오버라이딩 X
        System.out.println(dog1); // 오버라이딩 O
        System.out.println(dog2); // 오버라이딩 O

        System.out.println("3. Object 다형성 활용");
        // static으로 메서드를 만들었으므로 클래스에 직접 접근
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
        
        // Car 인스턴스는 toString()을 재정의 하지 않아 Object가 제공하는 기본 toString() 사용

        // 참고, 객체의 참조값 직접 출력
        // toString()이나 hashCode()를 재정의하면 객체의 참조값을 출력할 수 없다.
        // 이 때, 다음 코드를 사용하면 객체의 참조값을 출력할 수 있다.
        // System.identityHashCode를 사용해 해시코드를 반환하고, Integer.toHexString를 사용해 16진수로 바꾼다.

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue : " + refValue);
        String refValue1 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue1 : " + refValue1);

        // Object와 OCP
        // 만약 Object가 없고, 또 Object가 제공하는 toString()이 없다면 서로 아무 관계가 없는 객체의 정보를 출력하기 어렵다.
        // 여기서 아무 관계가 없다는 것은 공통의 부모가 없다는 뜻이다.
        // 따라서 Dog와 Car에서 각각의 메서드(객체 정보 출력)를 생성해야 한다.
        // 그런식으로 클래스를 만들면 구체적인 타입인 Car와 Dog에 의존한다.
        // 하지만 ObjectPrinter에서는 추상적인 타입인 Object에 의존한다.
        //  - 여기서의 추상은 단순히 interface나 abstract를 의미하는 것이 아니라 관계를 떠올려 봤을 때, 부모 타입으로 올라갈 수록 개념이 추상적이게 되는 것을 의미한다.

        // Object와 ObjectPrinter를 사용하는 구조는 다형성을 매우 잘 활용하고 있다.
        // 이는 다형적 참조와 메서드 오버라이딩을 적절하게 사용한다는 것이다.
        // ObjectPrinter.print()는 모든 객체 인스턴스를 인수로 받고, Dog와 Car에서 toString()을 오버라이딩 하여 사용할 수 있다.
        //  - 이는 추상적인 Object 타입에 의존하면서 런타입에 각 인스턴스의 toString()을 호출할 수 있다는 뜻이다.

        // OCP 원칙(클라이언트 코드 수정 X, 기능 확장 O)
        // Open : 새로운 클래스를 추가하고, toString()을 오버라이딩 해서 기능을 확장할 수 있다.
        // Closed : 새로운 클래스를 추가해도 Object와 toString()을 사용하는 클라이언트 코드인 ObjectPrinter는 변경하지 않아도 된다.

        // System.out.println()
        // System.out.println() 메서드도 Object 매개 변수를 사용하고, 내부에서 toString()을 호출한다.
        // 따라서 System.out.println()를 사용하면 세상의 모든 객체 정보(toString())를 편리하게 출력할 수 있다.

        // 자바 언어는 객체지향 언어 답게 스스로도 객체지향의 특징을 매우 잘 활용한다.
        // 자바 언어가 기본으로 제공하는 메서드들은 개발자가 필요에 따라 오버라이딩해서 사용할 수 있도록 설계되어 있다.

        // 참고
        // 정적 의존 관계 vs 동적 의존 관계
        // 정적 의존 관계는 컴파일 시간에 결정되며, 주로 클래스 간의 관계를 의미한다.
        // 쉽게 이야기해서 프로그램을 실행하지 않고, 클래스 내에서 사용하는 타입들만 보면 쉽게 의존 관계를 파악할 수 있다.

        // 동적 의존 관계는 런타임 시 확인할 수 있는 의존관계이다.
        // ObjectPrinter.print(Objecr obj)에 인자로 어떤 객체가 전달될 지는 프로그램을 실행해봐야 알 수 있다.
        // 이렇듯 런타임에 어떤 인스턴스를 사용하는 지를 나타내는 것이 동적 의존 관계이다.

        // 참고로 단순히 의존관계 또는 어디에 의존한다고 하면 주로 정적 의존관계를 뜻한다.
    }
}
