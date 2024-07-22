package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;


public class GetTimeMain {
    // 날짜와 시간 조회하고 조작하기 1
    // 날짜와 시간을 조회하려면 날짜와 시간 항목중에 어떤 필드를 조회해야 할 지 선택해야 한다.
    // 이 때, 날짜와 시간의 필드를 뜻하는 ChronoField가 사용된다.
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("YEAR : " + dt.get(ChronoField.YEAR)); // get()을 통해 조회를 하고, 그 중 연도를 조회하기 때문에 ChronoField의 YEAR을 사용한다.
        System.out.println("MONTH_OF_YEAR : " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_MONTH : " + dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println("HOUR_OF_DAY : " + dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println("MINUTE_OF_HOUR : " + dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("SECOND_OF_MINUTE : " + dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("YEAR : " + dt.getYear());
        System.out.println("MONTH_OF_YEAR : " + dt.getMonthValue()); // getMonth()도 가능하지만, 숫자가 아닌 영문으로 반환한다.
        System.out.println("DAY_OF_MONTH : " + dt.getDayOfMonth());
        System.out.println("HOUR_OF_DAY : " + dt.getHour());
        System.out.println("MINUTE_OF_HOUR : " + dt.getMinute());
        System.out.println("SECOND_OF_MINUTE : " + dt.getSecond());

        // 편의 메서드에 없는 경우 get 메서드로 직접 접근해 조회하면 된다.
        System.out.println("편의 메서드에 없는 경우");
        System.out.println("MINUTE_OF_DAY : " + dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY : " + dt.get(ChronoField.SECOND_OF_DAY));

        // 기본적으로 조회는 TemporalAccessor의 get(TemporalField  field)을 써야 한다.
        //  - LocalDateTime을 포함한 특정 시점의 시간을 제공하는 클래스는 모두 TemporalAccessor 인터페이스를 구현한다.
        //  - TemporalAccessor는 특정 시점의 시간을 조회하는 기능을 제공한다.
        //  - get(TemporalField field)을 호출할 때 어떤 날짜와 시간 필드를 조회할 지 TemporalField의 구현 ChronoField를 인수로 전달하면 된다.

        // 편의 메서드 사용
        //  - get(TemporalField field)을 사용하면 코드가 길어지고 번거롭기 때문에 자주 사용하는 조회 필드는 간단한 편의 메서드를 제공한다.
        //  - dt.get(ChronoField.DAY_OF_MONTH)) dt.getDayOfMonth()

        // 편의 메서드에 없음
        //  - 자주 사용하지 않는 특별한 기능은 편의 메서드를 제공하지 않는다.
        //  - 편의 메서드를 사용하는 것이 가독성이 좋기 때문에 일반적으로는 편의 메서드를 사용하고, 편의 메서드가 없는 경우 get(TemporalField field) 을 사용하면 된다.
    }
}
