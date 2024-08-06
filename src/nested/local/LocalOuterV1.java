package nested.local;

public class LocalOuterV1 {
    // 지역 클래스, 시작

    // 지역 클래스(Local Class)는 내부 클래스의 특별한 종류의 하나이다.
    // 따라서 내부 클래스의 특징을 그대로 가진다.
    //  - 바깥 클래스의 인스턴스 멤버에 접근할 수 있다.

    // 지역 클래스는 지역 변수와 같이 코드 블럭 안에서 정의된다.

    // 지역 클래스의 특징
    //  - 지역 클래스는 지역 변수처럼 코드 블럭 안에 클래스를 선언한다.
    //  - 지역 클래스는 지역 변수에 접근할 수 있다.

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }

    // 지역 클래스의 접근 범위
    // 자신의 인스턴스 변수인 value에 접근 가능
    // 자신이 속한 코드 블럭의 지역 변수인 localVar에 접근 가능
    // 자신이 속한 코드 블럭의 매개변수인 paramVar에 접근 가능, 참고로 매개 변수도 지역 변수의 한 종류이다.
    // 바깥 클래스의 인스턴스 멤버인 outInstanceVar에 접근 가능(지역 클래스도 내부 클래스의 한 종류이기 때문)

    // 지역 클래스는 지역 변수처럼 접근 제어자를 사용할 수 없다.
}
