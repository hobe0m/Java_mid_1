package lang.string.builder;

public class LoopStringBuilderMain {
    // StringBuilder를 사용했을 때의 속도
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 현재의 밀리 세컨드(1초의 1/1000) 시간을 구할 수 있음
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result : " + result);
        System.out.println("time : " + (endTime - startTime) + "ms");
    }

    // 정리
    // 문자열을 합칠 때 대부분의 경우 최적화가 되므로 + 연산을 사용하면 된다.

    // StringBuilder를 직접 사용하는 것이 더 좋은 경우
    //  - 반복문에서 반복해서 문자를 연결할 때
    //  - 조건문을 통해 동적으로 문자열을 조합할 때
    //  - 복잡한 문자열의 특정 부분을 변경해야 할 때
    //  - 매우 긴 대용량 문자열을 다룰 때

    // 참고
    // StringBuilder vs StringBuffer
    // StringBuilder와 똑같은 기능을 수행하는 StringBuffer 클래스도 있다.
    // StringBuffer는 내부에 동기화가 되어 있어서, 멀티 쓰레드 상황에 안전하지만 동기화 오버 헤드로 인해 성능이 느리다.
    // StringBuilder는 멀티 쓰레드에 상황에 안전하지 않지만 동기화 오버 헤드가 없으므로 속도가 빠르다.
    // StringBuffer와 동기화에 관한 내용은 이후에 멀티 쓰레드를 학습해야 이해할 수 있다.
    // 지금은 이런 것이 있구나 정도만 알아두면 된다.

    // 여러 프로그램을 동시에 실행할 때, StringBuilder는 문제가 생기지만 StringBuffer는 문제가 생기지 않는다.
    // 그러나 StringBuffer는 하나씩 실행하게끔하므로 속도가 느리다.
    // 대신 안전하다는 장점이 있다.
}
