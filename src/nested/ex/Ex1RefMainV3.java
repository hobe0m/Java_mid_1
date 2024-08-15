package nested.ex;

import java.util.Random;

// 익명 클래스를 통한 리팩토링
public class Ex1RefMainV3 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    // 클래스가 아닌 객체를 생성해서 변수에 집어 넣어 사용
    //  - 지역 클래스에서 익명 클래스로 변환
    public static void main(String[] args) {
        Process dice = new Process() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 : " + randomValue);
            }
        };
        // 이 때 꼭 닫아주어야 한다.
        // 이는 자바의 분법 규칙이며 익명 클래스는 클래스의 정의와 인스턴스 생성을 동시에 수행하는 표현식으로 문장의 끝을 명시하기 위해 필요하다.
        // 즉, 정의와 객체 생성을 동시에 하는 것이 익명 클래스이기에 정의가 끝나는 부분에는 세미 콜론이 필요하므로 사용해야 한다.
        // 이 규칙은 코드의 명확성과 구문 분석의 일관성을 유지하는데 도움을 준다.

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i : " + i);
                }
            }
        };
        // 이 때 꼭 닫아주어야 한다.

        System.out.println("hello 실행");
    }

    // 이 때, 한 번씩만 생성해서 간단하게 사용하는 경우에는 익명 클래스로 만들어서 사용할 수 있다.
}
