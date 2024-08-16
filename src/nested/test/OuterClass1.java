package nested.test;

public class OuterClass1 {
    // NestedClass를 구현하고 hello() 메서드를 만들어라.
    // 즉, 정적 중첩 클래스를 만들고 Main 클래스에서 사용해라

    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}
