package lang.wrapper;

public class WrapperUtilsMain {
    // 래퍼 클래스
    // 주요 메서드와 성능
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자를 래퍼 객체로 변환, Primitive -> Wrapper
        Integer i2 = Integer.valueOf("10"); // 문자열을 래퍼 객체로 변환, Primitive -> Wrapper
        int intValue = Integer.parseInt("10"); // 문자열 전용, 기본형으로 변환, Wrapper -> Primitive

        // 비교
        // compareTo는 내 값과 인수로 넘어온 값을 비교, 내 값이 크면 1, 같으면 0, 작으면 -1 반환
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult); // i1의 value의 값이 20보다 작으므로 -1 반환

        // 산술 연산(더하기, 최소, 최대 등 제공)
        // 간단한 연산을 위한 static 메서드 제공
        System.out.println("sum : " + Integer.sum(10, 20));
        System.out.println("min : " + Integer.min(10, 20));
        System.out.println("max : " + Integer.max(10, 20));

        // parseInt() vs valueOf()
        // parseInt()는 기본형, valueOf()는 래퍼 형태를 반환
        // Long.parseLong, Integer.parseInt와 같이 각 타입에 parsexxx가 존재한다.
    }
}
