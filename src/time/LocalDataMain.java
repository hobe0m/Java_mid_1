package time;

import java.time.LocalDate;

public class LocalDataMain {
    // 기본 날짜와 시간, LocalDateTime
    // 가장 기본이 되는 날짜와 시간 클래스는 LocalDate, LocalTime, LocalDateTime이다.
    // LocalDate: 날짜만 표현할 때 사용한다. 년, 월, 일을 다룬다. 예) 2013-11-21
    // LocalTime: 시간만을 표현할 때 사용한다. 시, 분, 초를 다룬다. 예) 08:20:30.213
    //  - 초는 밀리초, 나노초 단위도 포함할 수 있다.
    // LocalDateTime: LocalDate 와 LocalTime 을 합한 개념이다. 예) 2013-11-21T08:20:30.213

    // 앞에 Local (현지의, 특정 지역의)이 붙는 이유는 세계 시간대를 고려하지 않아서 타임존이 적용되지 않기 때문이다.
    // 특정 지역의 날짜와 시간만 고려할 때 사용한다.
    //  - 애플리케이션 개발시 국내 서비스만 고려할 때
    //  - 나의 생일은 2016년 8월 16일이야.

    public static void main(String[] args) {
        // LocalDate.now() : 현재 날짜
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);

        // LocalDate.of() : 지정 날짜
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("지정 날짜 : " + ofDate);

        // 날짜 계산
        // 불변임을 주의해야 한다.
        // ofData.plusDays(10);
        // System.out.println("지정 날짜 + 10d : " + ofDate);
        // 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 꼭 반환값을 받아서 출력해야 한다.

        // plusDays() : 특정 일을 더한다.
        //  - 이 외에도 다양한 plusxxx()가 존재한다.
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d : " + plusDays);

        // 참고
        // 시간은 크게 보면 날짜까지 포함하는 경우도 있음을 주의해야 한다.
    }
}
