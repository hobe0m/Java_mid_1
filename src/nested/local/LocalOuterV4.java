package nested.local;

public class LocalOuterV4 {
    // 지역 클래스, 지역 변수 캡처
    // 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 바뀌면 안된다.
    // 따라서 final로 선언하거나 또는 사실상 final이어야 한다.
    // 이것은 자바의 문법이고 규칙이다.

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

        // 만약 localVar의 값을 변경한다면?
        // localVar = 10;, 컴파일 오류 발생
        // localVar = 20;, 컴파일 오류 발생

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();
    }
}
