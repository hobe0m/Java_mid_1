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
        // 익명 클래스의 경우에는 클래스명이 없어 개수에 맞게 숫자로 표현된다.
        Printer printer = new Printer() {
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
}
