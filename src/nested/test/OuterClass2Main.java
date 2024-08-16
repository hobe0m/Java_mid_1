package nested.test;

public class OuterClass2Main {
    // InnerClass의 hello() 메서드를 사용해라.
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass();
        inner.hello();
    }
}
