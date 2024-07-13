package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound(); 컴파일 오류 발생, Object 타입에는 sound가 없기 때문이다.
        // obj.move(); 컴파일 오류 발생, Object 타입에는 move가 없기 때문이다.

        // 객체에 맞는 다운 캐스팅을 통해 dog와 car의 메서드도 사용 가능하다.
        if (obj instanceof Dog dog) {
            dog.sound();
            // if (obj instanceof Dog) {
            // ((Dog)obj).sound();
            // 원래 이런식으로 사용하지만 obj instanceof Dog dog으로 선언을 해주면 선언해준 타입으로 다운캐스팅이 자연스럽게 된다.
        } else if (obj instanceof Car car) {
            // A instanceof B : A가 B의 인스턴스인지 확인
            // A instanceof B b : A가 B의 인스턴스인지 확인 후 맞다면 A를 b라는 변수에 담는다.
            // 즉, obj가 Car의 인스턴스가 맞다면 car 변수에 담는다.
            car.move();
        }

        // Object가 모든 객체의 부모이기 때문에 다 담을 수 있어 좋긴 하지만 Object는 Dog가 뭔지 Car가 뭔지 즉, 자식 클래스들을 모른다.
        // 항상 찾을 때는 위로만 올라갈 수 있기 때문이다.
        // 따라서 object로 담고 자식 객체의 메서드를 사용할 때에는 다운캐스팅을 명시적으로 해주어야 한다.

        // Object 다형성의 장점
        // Object는 모든 객체의 부모이므로 어떤 객체든지 인자로 전달할 수 있다.

        // Object 다형성의 한계
        // 자식 객체를 담을 수는 있지만 메서드는 사용할 수 없다.
        //  - 모든 객체를 대상으로 다형적 참조를 할 수 있지만 Object를 통해 전달 받은 객체를 호출하려면 각 객체에 맞는 다운캐스팅 과정이 필요하다.
        // 메서드를 찾을 때 위로는 찾는 게 가능하지만 아래로는 가지 못하기 때문이다.
        //  - Object 타입에서 메서드를 찾지만, Dog 타입에서는 메서드를 찾지 않는다.
        // 따라서 그대로 실행하면 오류가 발생하고, Dog 인스턴스의 sound()를 호출하려면 다운캐스팅을 해야 한다.

        // 다형성을 제대로 활용하려면 다형적 참조 + 메서드 오버라이딩을 함께 사용해야 한다.
        // 따라서 Object를 사용한 다형성에는 한계가 있는 것이다.
        // Object에 있는 메서드들을 오버라이딩해서 사용할 수는 있다.
        // 결과적으로 Object는 다형적 참조는 가능하지만, 메서드 오버라이딩이 안되기 때문에 다형성을 활용하기에는 한계가 있다.
    }
}