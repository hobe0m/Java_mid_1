package nested.ex;

import java.util.Random;

// 리팩토링 결과
public class Ex1RefMainV1 {
    // Process process를 넣는 이유는 내부 클래스들이 모두 Process를 가지고 있기 때문이다.
    // Process는 구현하는 틀(규칙)이기에 오버라이딩을 한 메서드들은 Process를 가진다고 할 수 있다.
    //  - 규칙에 맞춰 구현했기 때문에

    // 매개 변수에 인터페이스를 넣으면 해당 인터페이스를 구현한 모든 클래스의 객체를 받을 수 있다.
    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // Process process 매개 변수를 통해 인스턴스를 전달할 수 있으며, 넘어 온 인스턴스의 run() 메서드를 실행하면 필요한 코드 조각을 실행할 수 있다.
        // 이 때 다형성을 활용해서 외부에서 전달되는 인스턴스에 따라 각각 다른 코드 조각이 실행된다.
        // 인터페이스의 다형성을 통해 외부에서 코드 조각을 받아오기 때문에, 넘어오는 구현체에 맞춰 사용 가능하다.
        // 즉, Dice가 넘어오면 Dice의 run을 Sum이 넘어오면 Sum의 run을 실행시킨다.
        process.run();

        System.out.println("프로그램 종료");
    }

    // static 클래스가 아니라 외부에 하나의 클래스로 만들어도 된다.
    static class Dice implements Process {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 : " + randomValue);
        }
    }

    // static 클래스가 아니라 외부에 하나의 클래스로 만들어도 된다.
    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i : " + i);
            }
        }
    }

    // 어떠한 구현체를 넣는가에 따라 결과값이 달라진다.
    public static void main(String[] args) {
        // Dice dice = new Dice();
        // Sum sum = new Sum();
        // 위와 같이 사용해도 된다.

        System.out.println("hello 실행");
        hello(new Dice());
        hello(new Sum());
    }

    // 코드 조각을 외부에서 전달하는 방법
    // 코드 조각은 보통 메서드(함수)에 정의한다.
    // 따라서 코드 조각을 전달하기 위해서는 메서드가 필요하다.
    // 그런데 지금까지 학습한 내용으로는 메서드를 전달할 수 있는 방법이 없으니, 인스턴스를 전달하고 인스턴스에 있는 메서드를 호출하면 된다.
    // 따라서 여기서는 인터페이스를 정의하고 구현 클래스를 만들었다.

    // Dice, Sum 각각의 클래스는 Process 인터페이스를 구현하고 run() 메서드에 필요한 코드 조각을 구현한다.
    // 여기서는 정적 중첩 클래스를 사용한다, 물론 정적 중첩 클래스가 아니라 외부에 클래스를 직접 만들어도 된다.

    // 정리
    // 문자열과 같은 데이터를 메서드에 전달할 때는 String, int와 같은 각 데이터에 맞는 타입을 전달하면 된다.
    // 코드 조각을 메서드에 전달할 때는 인스턴스를 전달하고 해당 인스턴스에 있는 메서드를 호출하면 된다.
}
