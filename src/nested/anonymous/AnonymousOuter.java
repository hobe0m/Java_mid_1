package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    // 익명 클래스
    // 익명 클래스(Anonymous class)는 지역 클래스의 특별한 종류의 하나이다.
    // 익명 클래스는 지역 클래스인데, 클래스의 이름이 없다는 특징이 있다.

    // LocalOuter2를 살펴보면 지역 클래스를 사용하기 위해 선언과 생성이라는 2단계를 거친다.
    //  - 선언 : 지역 클래스를 LocalPrinter라는 이름으로 선언, 이 때 Printer 인터페이스도 함께 구현
    //   - 선언 예시
    //     class LocalPrinter implements Printer {
    //     }

    //  - 생성 : new LocalPrinter()를 사용해서 앞서 선언한 지역 클래스의 인스턴스를 생성
    //   - 생성 예시
    //     Printer printer = new Printer();

    // 익명 클래스를 사용하면 클래스의 이름을 생략하고, 클래스의 선언과 생성을 한번에 처리할 수 있다.

    // 즉, 지역 클래스는 생성과 선언을 따로 나누어 해야하지만, 익명 클래스는 한번에 처리할 수 있다.

    // 익명 클래스의 예시(선언과 생성을 한번에)
    // Printer printer = new Printer() {
    // }

    private int outInstanceVar = 3;

    public void process(int paramVar) {

        int localVar = 1;

        /*
        // 기존의 로컬 클래스 선언과 생성

        // 선언
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        // 생성
        LocalPrinter printer = new LocalPrinter();
        */

        // 익명 클래스는 생성하면서 바디를 구현
        // 즉, 클래스의 이름과 구현하는 인터페이스를 따로 선언하지 않고 바로 구현을 하는 것
        //  - 클래스의 이름과 구현하는 인터페이스 X
        // 익명 클래스의 경우에는 클래스명이 없어 개수에 맞게 숫자로 표현된다.
        Printer printer = new Printer() {
            // Printer()를 구현하겠다라는 뜻(부모 타입)
            // 만일 부모 클래스라면 상속받겠다는 뜻
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }

    // new Printer() { body }
    // 익명 클래스는 클래스의 본문(body)을 정의하면서 동시에 생성한다.
    // new 다음에 바로 상속 받으면서 구현할 부모 타입을 입력하면 된다.
    //  - 여기서는 Printer 인터페이스를 구현하는 것이므로 Printer를 적었다.
    //  - 따라서 body 부분에는 구현할 인터페이스의 메서드를 모두 오버라이딩 해주어야 한다.
    // 이 코드는 마치 인터페이스 Printer를 생성하는 것처럼 보이지만 자바에서 인터페이스 생성은 불가능하다.
    // 이 코드는 인터페이스를 생성하는 것이 아니고, Printer라는 이름의 인터페이스를 구현한 익명 클래스를 생성하는 것이다.
    // { body } 부분에 Printer 인터페이스를 구현한 코드를 작성하면 되고 이 부분이 익명 클래스의 본문이 된다.
    // 쉽게 이야기해서 Printer를 상속(구현)하면서 바로 생성하는 것이다.

    // 익명 클래스의 특징
    //  - 익명 클래스는 이름 없는 지역 클래스를 선언하면서 동시에 생성한다.
    //  - 익명 클래스는 부모 클래스를 상속 받거나, 또는 인터페이스를 구현해야 하므로 익명 클래스를 사용할 때는 상위 클래스나 인터페이스가 필요하다.
    //  - 익명 클래스는 말 그대로 이름이 없어 생성자를 가질 수 없다(기본 생성자만 사용됨).
    //  - 익명 클래스는 AnonymousOuter$1과 같이 자바 내부에서 바깥 클래스 이름 + $ + 숫자로 정의되며, 익명 클래스가 여러 개면 $1, $2와 같이 숫자가 증가하면서 구분된다.

    // 익명 클래스의 장점
    // 익명 클래스를 사용하면 클래스를 별도로 정의하지 않고도 인터페이스나 추상 클래스를 즉성에서 구현할 수 있어 코드가 더 간결해진다.
    // 하지만, 복잡하거나 재사용이 필요한 경우에는 별도의 클래스를 정의하는 것이 좋다.

    // 결론은 그냥 지역 클래스를 쓰면 된다.

    // 익명 클래스를 사용할 수 없는 경우
    // 익명 클래스는 단 한번만 인스턴스를 생성할 수 있다.
    // 다음과 같이 여러번 생성이 필요하다면 익명 클래스를 사용할 수 없다.

    // Printer printer1 = new LocalPrinter();
    // printer1.print();

    // Printer printer2 = new LocalPrinter();
    // printer2.print();

    // 이런 경우 지역 클래스를 선언하고 사용하면 된다.

    // 정리
    // 익명 클래스는 이름이 없는 지역 클래스이다.
    // 특정 부모 클래스(인터페이스)를 상속 받고 바로 생성하는 경우 사용한다.
    //  - 1회용이므로 다회 생성해서 사용해야 할 때는 사용할 수 없다.
    // 지역 클래스가 일회성으로 사용되는 경우나 간단한 구현을 제공할 때 사용한다.
}
