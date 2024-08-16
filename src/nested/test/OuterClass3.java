package nested.test;

public class OuterClass3 {
    // 지역 클래스 LocalClass를 구현하고 hello() 메서드를 호출해라.

    public void myMethod() {
        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass local = new LocalClass();
        local.hello();
    }
}
