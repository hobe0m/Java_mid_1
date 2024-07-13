package lang.object.poly;

public class ObjectPolyExample2 {
    // Object 배열
    // Object는 모든 타입의 객체를 담을 수 있으므로 Object[]를 만들면 세상의 모든 객체를 담을 수 있는 배열을 만들 수 있다.
    public static void main(String[] args) {
        // ctrl + alt + v : 변수 추출 기능, new를 통해 새로운 객체를 생성하면 변수 이름을 제안하고 대체해준다.
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object}; // 배열은 같은 타입의 데이터를 하나로 묶음, Dog 타입의 dog1, dog2, dog3이 있다면 Dog[]로 묶을 수 있다.

        // Object[] objects = new Objcet[3];
        // objects[0] = dog;
        // objects[1] = car;
        // objects[2] = object;
        // 이 코드와 같다.

        size(objects); // alt + enter를 통해 메서드를 편리하게 만들 수 있다.
    }

    private static void size(Object[] objects) {
        // 이 메서드는 Object 타입을 사용하기 때문에 java를 사용하는 곳이라면 다른 곳에서도 사용할 수 있다.
        System.out.println("전달된 객체의 수는 : " + objects.length);
    }

    // Object가 없다면 모든 객체를 받을 수 있는 메서드, 모든 객체를 저장할 수 있는 배열을 만들 수 없다.
    // 물론 Object가 없어도 MyObject와 같은 클래스를 만들고 모든 클래스에서 상속 받아 사용할 수 있지만, 전세계 모든 개발자가 비슷한 클래스를 만들것이기에 서로 호환되지 않는 수많은 XxxObject들이 넘쳐날 것이다.
}
