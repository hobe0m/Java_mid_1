package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class ChangeTimePlusMain {
    // 날짜와 시간 조작하기
    // 날짜와 시간을 조작하려면 어떤 시간 단위(Unit)를 변경할 지 선택해야 한다.
    // 이때 날짜와 시간의 단위를 뜻하는 ChronoUnit 이 사용된다.
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plusDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("plusDt1 = " + plusDt1);

        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println("plusDt2 = " + plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println("plusDt3 = " + plusDt3);

        // Temporal plus(long amountToAdd, TemporalUnit unit)
        //  - LocalDateTime을 포함한 특정 시점의 시간을 제공하는 클래스는 모두 Temporal 인터페이스를 구현한다.
        //  - Temporal 은 특정 시점의 시간을 조작하는 기능을 제공한다.
        //  - plus(long amountToAdd, TemporalUnit unit)를 호출할 때 더하기 할 숫자와 시간의 단위(Unit)를 전달하면 된다.
        //   -  이때 TemporalUnit의 구현인 ChronoUnit을 인수로 전달하면 된다.
        //  - 불변이므로 반환 값을 받아야 한다.
        //  - 참고로 minus()도 존재한다.

        // 편의 메서드 사용
        //  - 자주 사용하는 메서드는 편의 메서드가 제공된다.
        //  - dt.plus(10, ChronoUnit.YEARS) dt.plusYears(10)

        // Period를 사용한 조작
        //  - Period나 Duration은 기간(시간의 간격)을 뜻한다. 특정 시점의 시간에 기간을 더할 수 있다.

        // 정리
        // 시간을 조회하고 조작하는 부분을 보면 TemporalAccessor.get(), Temporal.plus()와 같은 인터페이스를 통해 특정 구현 클래스와 무관하게 아주 일관성 있는 시간 조회, 조작 기능을 제공하는 것을 확인할 수 있다.
        // 덕분에 LocalDateTime, LocalDate, LocalTime, ZonedDateTime, Instant와 같은 수 많은 구현에 관계없이 일관성 있는 방법으로 시간을 조회하고 조작할 수 있다.

        // 하지만, 모든 시간 필드를 조회할 수 있는 것은 아니다.
    }
}