package nested.local;

public class LocalOuterV4 {
    // 지역 클래스, 지역 변수 캡처
    // 지역 클래스가 접근하는 지역 변수는 절대로 중간에 값이 바뀌면 안된다.
    // 따라서 final로 선언하거나 또는 사실상 final이어야 한다.
    // 이것은 자바의 문법이고 규칙이다.

    // 사실상 final
    // 영어로는 effectively final이라고 한다.
    // 사실상 final 지역 변수는 지역 변수에 final 키워드를 사용하지는 않았지만 값을 변경하지 않는 지역 변수를 뜻한다.
    // final 키워드를 넣지 않았을 뿐이지, 실제로는 final 키워드를 넣은 것 처럼 중간에 값을 변경하지 않은 지역 변수이다.
    // 따라서 사실상 final 지역 변수는 final 키워드를 넣어도 동일하게 작동해야 한다.

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
