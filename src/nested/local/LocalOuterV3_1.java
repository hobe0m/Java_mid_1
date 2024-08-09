package nested.local;

import java.lang.reflect.Field;

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
    //  - 지역 클래스의 인스턴스 생성 시 접근하는 지역 변수만 캡처
    
    // 지역 변수 캡처 과정
    // LocalPrint 인스턴스 생성 시도 시 지역 클래스가 접근하는 지역 변수를 확인
    //  - LocalPrint는 paramVar, LocalVar 지역 변수에 접근
    
    // 사용하는 지역 변수 복사
    //  - 지역 클래스가 사용하는 지역 변수 복사(매개 변수도 지역 변수 중 하나)
    //  - 따라서 paramVar, localVar 복사

    // 이 후 복사한 지역 변수를 인스턴스에 포함해서 생성한다.
    //  - 따라서 복사한 지역 변수를 인스턴스를 통해 접근할 수 있는 것이다.

    // 따라서 LocalPrinter 인스턴스에서 print() 메서드를 통해 paramVar, localVar에 접근 할 수 있는 것은 지역 변수에 접근하는 것이 아니라 인스턴스 내부의 복사된 캡처 변수에 접근하는 것이다.
    // 캡처한 paramVar, localVar의 생명 주기는 LocalPrinter 인스턴스의 생명 주기와 같다.
    //  - 따라서 LocalPrinter 인스턴스는 지역 변수의 생명 주기와 무관하게 언제든지 paramVar, localVar 캡처 변수에 접근할 수 있다.
    //  - 이렇게 해서 지역 변수와 지역 클래스를 통해 생성한 인스턴스의 생명 주기가 다른 문제를 해결한다.
    
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

        // 추가
        System.out.println("필드 확인");

        // 메서드 체이닝으로 확인
        // getClass() : 클래스 정보 확인
        // getDeclaredFields() : 클래스 내부에 선언된 필드의 정보 확인
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

        // 출력 결과
        //  - field = int nested.local.LocalOuterV3_1$1LocalPrinter.value
        //  - field = final int nested.local.LocalOuterV3_1$1LocalPrinter.val$localVar
        //  - field = final int nested.local.LocalOuterV3_1$1LocalPrinter.val$paramVar
        //  - field = final nested.local.LocalOuterV3_1 nested.local.LocalOuterV3_1$1LocalPrinter.this$0

        // 복사된 localVar, paramVar가 캡처 변수 즉, 필드로 들어가 있는 것을 알 수 있다.
        // 추가로 바깥 클래스를 참조하기 위한 필드도 확인할 수 있다.
        //  - 이런 필드들은 자바가 내부에서 만들어 사용하는 필드들이다.
    }
}