package nested.ex;

// Ex0Main 코드를 중복 없이 리팩토링
public class Ex1Main {
    public static void hello(String str) {
        System.out.println("프로그램 시작");
        System.out.println(str);
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello("hello Spring");
    }
}
