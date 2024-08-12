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
    // 이 때, 지역 클래스가 참조하는 바깥 클래스의 지역 변수만 해당한다.

    // 선언하고 한번도 값을 바꾸지 않은 것을 사실상 final이라고 한다.ㄴ

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
        // 다시 캡처를 해야 하는 건가?

        // 답은 컴파일 오류가 발생한다는 것이다.
        // localVar = 10;, 컴파일 오류 발생
        // localVar = 20;, 컴파일 오류 발생

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);
        printer.print();
    }

    // Printer printer = new LocalPrinter();
    //  - LocalPrinter를 생성하는 시점의 지역 변수인 localVar, paramVar를 캡처한다.
    //  - 만일 생성 이후 캡처한 지역 변수의 값을 변경하면 스택 영역에 존재하는 지역 변수의 값과 인스턴스에 캡처한 변수의 값이 서로 달라지는 문제가 발생한다.
    //  - 이걸 동기화 문제라고 하고, 컴파일 오류가 발생한다.
    //  - 물론 자바 언어를 설계할 때 지역 변수의 값이 변경되면 인스턴스에 캡처한 변수의 값도 함께 변경하도록 설계하면 된다.
    //  - 하지만 이로 인해 수많은 문제들이 파생될 수 있다.
    //  - 따라서 필요하다면 변수를 새로 생성(복사)해서 사용하면 된다.

    // 캡처 변수의 값을 변경하지 못하는 이유
    //  - 지역 변수의 값을 변경하면 인스턴스에 캡처한 변수의 값도 변경해야 하기 때문이다.
    //  - 반대로 인스턴스에 있는 캡처 변수의 값을 변경하면 해당 지역 변수의 값도 다시 변경해야 하기 때문이다.
    //  - 개발자 입장에서 보면 예상치 못한 곳에서 값이 변경될 수 있고, 이는 디버깅을 어렵게 한다.
    //  - 지역 변수의 값과 인스턴스에 있는 캡처 변수의 값을 서로 동기화 해야 하는데, 멀티쓰레드 상황에서 이런 동기화는 매우 어렵고, 성능에 나쁜 영향을 줄 수 있다.
    //   - 이 부분은 멀티 쓰레드를 학습한 뒤에 더 자세하게 이해할 수 있다.

    // 이 모든 문제는 캡처한 지역 변수의 값이 변하기 때문에 발생하므로 자바는 캡처한 지역 변수의 값을 변하지 못하게 막아 이런 복잡한 문제들을 근본적으로 차단한다.

    // 참고
    // 변수 캡처에 대한 내용이 이해가 어렵다면 단순하게 지역 클래스가 접근하는 지역 변수의 값은 변경하면 안된다는 정도로 이해하면 충분하다.
}