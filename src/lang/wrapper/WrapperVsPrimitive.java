package lang.wrapper;

public class WrapperVsPrimitive {
    // 래퍼 클래스와 성능
    // 래퍼 클래스의 성능이 좋은데 래퍼 클래스만 쓰는 것이 아닌, 기본형이 남아있는 이유는 무엇일까?
    public static void main(String[] args) {
        int iterations = 1_000_000_000; // 자바에서는 숫자 자릿수의 구분을 위해 언더바(_)를 사용하는 것을 허용한다.

        // 이처럼 출력 시 1000000000으로 언더바는 빠진 채로 출력된다.
        System.out.println(iterations);

        long startTime, endTime;

        // 기본형 long 사용(0.27초 소요)
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis(); // 현재 시간
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) + "ms");
        
        // 래퍼 클래스 long 사용(2.7초 소요)
        Long sumWrapper = 0L; // long 타입이므로 L을 적어준다.
        startTime = System.currentTimeMillis(); // 현재 시간
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // 오토 박싱 발생
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long 실행 시간 : " + (endTime - startTime) + "ms");

        // 단순히 값을 10억 번 더하는 것인데, 결과 값은 같지만 소요 시간이 차이난다.
        // 기본형이 대략 10배 정도 빠르다.
        //  - 일반적인 애플리케이션을 만드는 관점에서 보면 이런 부분을 최적화해도 아주 사소한 차이만 발생한다.
        // 기본형은 메모리에서 단순히 그 크기만큼의 공간을 차지하지만, 래퍼 클래스의 인스턴스는 내부의 필드와 객체 자체를 다루는데 필요한 객체 메타데이터를 포함하기 때문이다.
        // 따라서 더 많은 메모리를 사용하고 자바 버전과 시스템에 따라 다르지만 대략 8~16바이트를 더 사용한다.

        // 기본형과 래퍼 클래스의 사용 시기
        // CPU 연산을 아주 많이 수행하는 특수한 경우거나, 수만 - 수십만 이상 연속해서 연산을 수행해야 하는 경우라면 기본형 사용
        // 그렇지 않은 경우라면 코드를 유지보수하기 더 나은 것을 선택하면 된다.

        // 유지보수 vs 최적화
        // 유지보수와 최적화를 고민하는 상황이면 유지보수하기 좋은 코드를 먼저 고민해야 한다.
        // 특히 현 시대의 컴퓨터는 매우 빠르기 때문에 메모리 상에서 발생하는 연산을 줄여도 실질적인 도움이 되지 않는다.
        // 웹 애플리케이션의 경우 메모리 안에서 발생하는 연산 하나보다 네트워크 호출 한 번이 많게는 수십만배 더 오래 걸리는 것도 이유이다.
        // 따라서 권장하는 방법은 개발 이후 성능 테스트를 해보고 정말 문제가 되는 부분만 찾아서 최적화 하는 것이다.
    }
}
