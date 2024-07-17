package lang.system;

import java.util.Arrays;

public class SystemMain {
    // System 클래스
    // 시스템과 관련된 기본 기능들을 제공
    public static void main(String[] args) {
        // 현재 시간(밀리초 단위)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초 단위)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수(운영체제가 사용하는 것들)를 읽는다.
        System.out.println("getenv : " + System.getenv());
        // 반환값은 자료 구조를 알아야 해서 확인하지 않고 바로 출력, 추후에 학습

        // 시스템 속성(자바가 사용하는 것들)을 읽는다.
        System.out.println("properties : " + System.getProperties());
        System.out.println("Java version : " + System.getProperty("java.version"));

        // 배열을 고속으로 복사(운영체제로 넘겨 운영체제와 하드웨어가 협동해 복사)
        // 운영체제 - 하드웨어에서는 배열을 통째로 복사하기 때문에 loop를 사용하는 것보다 속도가 매우 빠르다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        // 1. 기준 배열
        // 2. 기준 배열의 시작 인덱스(어디서부터 복사할건지)
        // 3. 복사 받을 배열
        // 4. 복사 받을 배열의 시작 인덱스 위치(어디부터 넣을 건지)
        // 5. 기준 배열의 마지막 인덱스(어디까지 넣을건지, length로 끝까지 가능)
        System.arraycopy(originalArray, 0, copiedArray, 0
        , originalArray.length);

        // 배열 출력(그냥 출력하면 배열의 참조값이 나온다)
        System.out.println("copiedArray = " + copiedArray);
        // Arrays.toString() : 배열의 참조값을 벗겨 내부의 배열을 반환
        System.out.println("Array.toString(copiedArray) = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        // 이건 가급적이면 사용하지 않는 것을 권장, 프로그램이 의도하지 않게 종료될 수 있어 문제가 생길 수 있다.
        // 특히나 웹 애플리케이션의 경우에는 절대로 사용하면 안된다.
        // 예외적으로 필요한 경우에만 사용
        // 인자(status)가 0이면 정상적인 종료, 0이 아니면 오류나 예외적인 종료
        System.exit(0);
        System.out.println("hello");
        
        // System.in : 표준 입력 스트림
        // System.out : 표준 출력 스트림
        // Syster.err : 표준 오류 스트림
    }
}
