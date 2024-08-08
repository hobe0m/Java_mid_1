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

    // 바깥의 인스턴스 변수(멤버 변수) 선언
    private int outInstanceVar = 3;

    // 매개 변수도 지역 변수이다.
    // 지역에서 사용하는 변수이기 때문이다.
    public void process(int paramVar) {
        // process 메서드 내부의 지역 변수 선언
        int localVar = 1;

        class LocalPrinter {
            // 지역 클래스 내의 인스턴스 변수(멤버 변수) 선언
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        
        // 같은 클래스 내에 있으므로 객체 생성 가능
        // 객체 생성 후 내부의 메서드 사용
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    // main 메서드는 구분해서 따로 만들어주어도 된다.
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
    
    // process라는 메서드 안에 클래스가 존재하므로 process를 사용하면 자동으로 printData의 결과도 출력된다.
}
