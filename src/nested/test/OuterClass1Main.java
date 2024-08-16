package nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 여기에서 NestedClass의 hello() 메서드를 호출해라.
        // 즉, 정적 중첩 클래스의 메서드를 호출해라.

        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}
