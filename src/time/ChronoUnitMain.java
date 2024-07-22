package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    // 날짜와 시간의 핵심 인터페이스
    // TemporalAccessor -> Temporal(LocalDateTime, ZonedDateTime, Instant) -> TemporalAmount(Period, Duration)

    // TemporalAccessor 인터페이스
    //  - 날짜와 시간을 읽기 위한 기본 인터페이스
    //  - 이 인터페이스는 특정 시점의 날짜와 시간 정보를 읽을 수 있는 최소한의 기능을 제공한다.

    // Temporal 인터페이스
    //  - TemporalAccessor의 하위 인터페이스로, 날짜와 시간을 조작(추가, 빼기 등)하기 위한 기능을 제공한다.
    //  - 이를 통해 날짜와 시간을 변경하거나 조정할 수 있다.

    // 간단히 말하면, TemporalAccessor는 읽기 전용 접근을, Temporal은 읽기와 쓰기(조작) 모두를 지원한다.

    // TemporalAmount 인터페이스
    //  - 시간의 간격(시간의 양, 기간)을 나타내며, 날짜와 시간 객체에 적용하여 그 객체를 조정할 수 있다.
    //  - 예를 들어, 특정 날짜에 일정 기간을 더하거나 빼는 데 사용된다.

    // 시간의 단위와 시간 필드
    // 시간의 단위를 뜻하는 TemporalUnit(ChronoUnit)과 시간의 각 필드를 뜻하는 TemporalField(ChronoField)
    // TemporalUnit<interface> -> ChronoUnit(구현체)
    // TemporalField<interface> -> ChronoField(구현체)

    // TemporalUnit을 구현한 구현체 중 ChronoUnit만 사용한다고 생각하면 된다.

    // 시간의 단위, TemporalUnit, ChronoUnit
    //  - TemporalUnit 인터페이스는 날짜와 시간을 측정하는 단위를 나타내며, 주로 사용되는 구현체는 java.time.temporal.ChronoUnit 열거형으로 구현되어 있다
    //  - ChronoUnit은 다양한 시간 단위를 제공한다.
    //  - 여기서 Unit이라는 뜻을 번역하면 단위이기 때문에 시간의 단위 하나하나를 나타낸다.

    // ChronoUnit이 제공하는 시간 단위
    //  - NANOS : 나노초 단위
    //  - MICROS : 마이크로초 단위
    //  - MILLIS : 밀리초 단위
    //  - SECONDS : 초 단위
    //  - MINUTES : 분 단위
    //  - HOURS : 시간 단위

    // ChronoUnit이 제공하는 날짜 단위
    //  - DAYS : 일 단위
    //  - WEEKS : 주 단위
    //  - MONTHS : 월 단위
    //  - YEARS : 년 단위
    //  - DECADES : 10년 단위
    //  - CENTURIES : 세기 단위
    //  - MILLENNIA : 천년 단위

    // ChronoUnit이 제공하는 기타 단위
    //  - ERAS : 시대 단위
    //  - FOREVER : 무한대의 시간 단위

    // ChronoUnit의 주요 메서드
    //  - between(Temporal, Temporal) : 두 Temporal 객체 사이의 시간을 현재 ChronoUnit 단위로 측정하여 반환한다.
    //  - isDateBased() : 현재 ChronoUnit이 날짜 기반 단위인지 (예: 일, 주, 월, 년) 여부를 반환한다.
    //  - isTimeBased() : 현재 ChronoUnit이 시간 기반 단위인지 (예: 시, 분, 초) 여부를 반환한다.
    //  - isSupportedBy(Temporal) : 주어진 Temporal객체가 현재 ChronoUnit 단위를 지원하는지 여부를 반환한다.
    //  - getDuration() : 현재 ChronoUnit의 기간을 Duration 객체로 반환한다.

    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            // ChronoUnit이 toString()을 오버라이딩해서 상수를 문자열로 반환
            System.out.println("value = " + value);
        }
        // sout, soutv 단축키는 제일 뒤에 써줘도 된다.
        System.out.println("ChronoUnit.HOURS = " + ChronoUnit.HOURS);
        System.out.println("Hours.duration = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.duration = " + ChronoUnit.DAYS.getDuration().getSeconds());
        
        // 차이 구하기
        LocalTime l1 = LocalTime.of(1, 10, 0);
        LocalTime l2 = LocalTime.of(1, 20, 0);

        long secondsBetween = ChronoUnit.SECONDS.between(l1, l2);
        System.out.println("secondsBetween = " + secondsBetween);

        long minutesBetween = ChronoUnit.MINUTES.between(l1, l2);
        System.out.println("minutesBetween = " + minutesBetween);
    }
}
