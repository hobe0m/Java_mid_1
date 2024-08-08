package nested.local;

public class LocalOuterV3 {
    // 지역 클래스, 지역 변수 캡처

    // 참고로 지역 변수 캡처에 관한 내용은 너무 깊이 있게 이해하지 않아도 된다.
    // 이해가 어렵다면 단순하게 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다 정도로 이해하면 충분하다.

    // 변수의 생명 주기
    // 클래스 변수 : 메서드 영역에 존재하고 프로그램 종료 시까지 존재하는 생존 기간이 가장 긴 변수이다.
    //  - 클래스 변수(static)는 메서드 영역에 존재하고, 자바가 클래스 정보를 읽어들이는 순간부터 프로그램 종료까지 존재한다.
    //  - 값은 바뀔 수 있지만 사라지지는 않는다.

    // 인스턴스 변수 : 힙 영역에 존재하고, 인스턴스가 생존하는 동안 존재한다.
    //  - 인스턴스 변수는 본인이 소속된 인스턴스가 GC되기 전까지 존재한다.
    //  - 생존 주기가 긴 편에 속한다.

    // 지역 변수 : 스택 영역에 존재하고, 메서드의 호출이 끝나면 사라진다.
    //  - 지역 변수는 스택 영역의 스택 프레임 내에 존재한다.
    //  - 따라서 메서드가 호출되면 생성되고, 메서드 호출이 종료되면 스택 프레임이 제거되면서 그 안에 있는 지역 변수도 모두 제거된다.
    //  - 생존 주기가 매우 짧은 편에 속하며 매개 변수 또한 지역 변수의 한 종류이므로 동일하게 적용된다.

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        // 지역 변수이므로 스택 프레임이 종료되는 순간 함께 제거된다.
        int localVar = 1;

        // 지역 클래스 또한 클래스이기 때문에 인터페이스를 구현할 수 있다.
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        // 이 부분을 여기서 실행하지 않고, 인스턴스만 반환한다.
        // printer.print();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        // printer.print()를 전과 다르게 해당 위치에서 실행한다.
        // process()의 스택 프레임이 사라진 이후에 실행
        printer.print();
    }

    // process()는 Prinetr 타입을 반환한다.
    //  - 여기서는 LocalPrinter 인스턴스를 반환
    //  - 또한 여기서는 LocalPrinter.print() 메서드를 process() 안에서 실행하는 것이 아니라 process() 메서드가 종료된 이후에 main() 메서드에서 실행한다.

    // 결과는 동일하게 출력된다.

    // 지역 클래스 인스턴스의 생존 범위
    //  - 지역 클래스로 만든 객체도 인스턴스이기 때문에 힙 영역에 존재하므로 GC전까지 생존한다.
    //   - LocalPrinter 인스턴스는 process() 메서드 안에서 생성된다.
    //   - 그리고 process()에서 main()으로 생성한 LocalPrinter 인스턴스를 반환하고 printer 변수에 참조를 보관한다.
    //   - 따라서 LocalPrinter 인스턴스는 main()이 종료될 때까지 생존한다.
    //  - paramVar, localVar와 같은 지역 변수는 process() 메서드를 실행하는 동안에만 스택 영역에서 생존한다.
    //  - 따라서 process() 메서드가 종료되면 process() 스택 프레임이 스택 영역에서 제거되면서 함께 제거된다.

    // LocalPrinter 인스턴스는 print() 메서드를 통해 힙 영역에 존재하는 바깥 인스턴스의 변수인 outInstanceVar에 접근한다.
    // 이 부분은 인스턴스의 필드를 참조하는 것이기 때문에 특별한 문제가 없다.
    // LocalPrinter 인스턴스는 print() 메서드를 통해 스택 영역에 존재하는 지역 변수에도 접근하는 것처럼 보이지만, 스택 영역에 존재하는 지역 변수를 힙 영역에 있는 인스턴스가 접근하는 것은 생각처럼 단순하지 않다.

    // 지역 변수의 생명 주기는 매우 짧지만 인스턴스의 생명 주기는 GC전까지 생존할 수 있으므로 비교적 길다.
    // 지역 변수인 paramVar, localVar는 process() 메서드가 실행되는 동안에만 생존할 수 있고, process() 메서드가 종료되면 process()의 스택 프레임이 제거되면서 두 지역 변수도 함께 제거된다.
    // 여기서 문제는 process() 메서드가 종료되어도 LocalPrinter 인스턴스는 계속 생존할 수 있다는 점이다.

    // 예제를 보면 process() 메서드가 종료된 이후에 main() 메서드 안에서 LocalPrinter.print() 메서드를 호출한다.
    // LocalPrinter 인스턴스에 있는 print() 메서드는 지역 변수인 paramVar, localVar에 접근해야 하지만 process() 메서드가 이미 종료되었으므로 해당 지역 변수들도 제거된 상태이다.
    // 하지만 실행 결과를 보면 지역 변수들의 값이 모두 정상적으로 출력되고 있다.

    // 참고
    // 더 정확히 이야기 하면 LocalPrinter.print() 메서드를 실행하면 이 메서드도 당연히 스택 프레임에 올라가서 실행된다.
    // main() 에서 print()를 실행했으므로 main() 스택 프레임 위에 print() 스택 프레임이 올라간다.
    // 물론 process() 스택 프레임은 이미 제거된 상태이므로 지역 변수인 localVar, paramVar도 함께 제거되어서 접근할 수 없다.
}