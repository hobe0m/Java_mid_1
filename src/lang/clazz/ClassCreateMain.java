package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class; // Hello.class를 통해 Hello 클래스의 정보를 반환 후 Hello 타입의 객체 helloClass에 담는다.
        Class helloClass1 = Class.forName("lang.clazz.Hello"); // 마찬가지로 같은 타입의 객체로 받는다.

        // helloClass에서 getDeclaredConstructor()를 사용해 생성자를 꺼내 newInstance()로 새로운 객체를 생성한다.
        // 이 때, 만들어진 인스턴스는 Object 타입이므로 Hello의 타입으로 다운캐스팅을 해주어야 한다.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);

        // getDeclaredConstructor() : 생성자를 선택
        // newInstance() : 선택된 생성자를 기반으로 인스턴스를 생성

        // 리플렉션(reflection)
        // Class를 사용하면 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업을 할 수 있다.
        // 이런 작업을 리플렉션이라고 한다.
        // 추가로 애노테이션 정보를 읽어서 특별한 기능을 수행할 수도 있으며 최신 프레임워크들은 이런 기능을 적극 활용한다.
        // 지금은 Class가 뭔지, 그리고 대략 어떤 기능들을 제공하는지만 알아두면 충분하다.
        // 리플렉션은 이후에 별도로 다룬다.
    }
}
