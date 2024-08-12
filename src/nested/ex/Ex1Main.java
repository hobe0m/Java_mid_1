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
    
    // 변하는 부분만 외부에서 받아서 처리

    // 단순한 문제였지만 프로그래밍에서 중복을 제거하고, 좋은 코드를 유지하는 핵심은 변하는 부분과 변하지 않는 부분을 분리하는 것이다.
    // 여기서는 변하지 않는 부분은 그대로 유지하고, 상황에 따라 변화가 필요한 문자열은 외부에서 전달받아 처리했다.
    // 이렇게 변하는 부분과 변하지 않는 부분을 분리하고, 변하는 부분을 외부에서 전달 받으면 메서드(함수)의 재사용성을 높일 수 있다.
    // 여기서의 핵심은 변하는 부분을 메서드(함수) 내부에서 가지고 있는 것이 아니라 외부에서 전달받는다는 점이다.
}
