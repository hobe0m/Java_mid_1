package nested.ex;

public class Ex0Main {
    // 익명 클래스의 활용
    // 활용 전 간단한 문제 풀이
    // 코드 중복을 피할 수 있게 리팩토링하기
        public static void helloJava() {
            System.out.println("프로그램 시작");
            System.out.println("Hello Java");
            System.out.println("프로그램 종료");
        }

        public static void helloSpring() {
            System.out.println("프로그램 시작");
            System.out.println("Hello Spring");
            System.out.println("프로그램 종료");
        }
        
        /*
        public static void hello(String name) {
            System.out.println("프로그램 시작");
            
            // 변하는 부분 시작
            System.out.println("Hello Java");
            System.out.println("Hello Spring");
            // 변하는 부분 종료

            System.out.println("프로그램 종료");

        // 따라서 변하는 부분만 해결해주면 된다.
        // 매개변수를 통해 변하는 부분을 외부에서 받으면 된다.
        */

    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
