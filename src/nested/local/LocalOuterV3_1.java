package nested.local;

public class LocalOuterV3_1 {
    // 지역 클래스, 지역 변수 캡처
    // 지역 클래스는 지역 변수에 접근 할 수 있다.
    // 하지만 지역 변수의 생명 주기는 짧고, 지역 클래스를 통해 생성한 인스턴스의 생명 주기는 길다.
    // 따라서 지역 클래스를 통해 생성한 인스턴스가 지역 변수에 접근해야 하는데, 둘의 생명 주기가 다르기 때문에 인스턴스는 살아있지만, 지역 변수는 이미 제거된 상태일 수 있다.

    // 지역 변수 캡처
    // 자바는 이런 문제를 해결하기 위해 지역 클래스의 인스턴스를 생성하는 시점에 필요한 지역 변수를 복사해서 생성한 인스턴스에 함께 넣어둔다.
    // 이런 과정을 변수 캡쳐(Capture)라 한다.
    // 캡쳐는 스크린 샷을 떠올리면 되고, 스크린 샷처럼 인스턴스를 생성할 때 필요한 지역 변수를 복사해서 보관해 두는 것이다.
    // 물론 모든 지역 변수를 캡쳐하는 것이 아니라 접근이 필요한 지역 변수만 캡처한다.
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {

        int localVar = 1;

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

        Printer printer = new LocalPrinter();

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3_1 localOuter = new LocalOuterV3_1();

        Printer printer = localOuter.process(2);

        printer.print();
    }
}