package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;


public class ChangeTimeWithMain {
    // 날짜와 시간 조회하고 조작하기 2
    // 날짜와 시간을 조작하는 with() 메서드
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        // with()는 특정 필드 딱 하나만 바꿀 때 사용한다.
        // with()를 통해 연도를 2020년으로 바꾸기
        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changedDt1 = " + changedDt1);

        // 편의 메서드
        LocalDateTime changedDt2 = dt.withYear(2020);
        System.out.println("changedDt2 = " + changedDt2);

        // TemporalAdjuster 사용
        // 다음 주 금요일 구하기
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜 : " + dt);
        System.out.println("다음 주 금요일 : " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("기준 날짜 : " + dt);
        System.out.println("같은 달의 마지막 일요일 : " + with2);

        // Temporal with(TemporalField field, long newValue)
        //  - Temporal.with() 를 사용하면 날짜와 시간의 특정 필드의 값만 변경할 수 있다.
        //  - 불변이므로 반환 값을 받아야 한다.

        // 편의 메서드
        //  - 자주 사용하는 메서드는 편의 메서드가 제공된다
        //  - dt.with(ChronoField.YEAR, 2020) dt.withYear(2020)

        // TemporalAdjuster 사용
        //  - with() 는 아주 단순한 날짜만 변경할 수 있다.
        //  - 다음주 금요일, 이번 달의 마지막 일요일 같은 복잡한 날짜를 계산하고 싶다면 TemporalAdjuster를 사용하면 된다.

        // 원래대로 하면 이 인터페이스를 직접 구현해야겠지만, 자바는 이미 필요한 구현체들을 TemporalAdjusters 에 다 만들어두었다.
        // 우리는 단순히 구현체들을 모아둔 TemporalAdjusters 를 사용하면 된다.

        // TemporalAdjusters.next(DayOfWeek.FRIDAY) : 다음주 금요일을 구한다.
        // TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY) : 이번 달의 마지막 일요일을 구한다.

        // DayOfWeek
        //  - 월, 화, 수, 목, 금, 토, 일을 나타내는 열거형이다.

        // TemporalAdjusters 클래스가 제공하는 주요 기능
        //  - dayOfWeekInMonth : 주어진 요일이 몇 번째인지에 따라 날짜를 조정한다
        //  - firstDayOfMonth : 해당 월의 첫째 날로 조정한다.
        //  - firstDayOfNextMonth : 다음 달의 첫째 날로 조정한다.
        //  - firstDayOfNextYear : 다음 해의 첫째 날로 조정한다.
        //  - firstDayOfYear : 해당 해의 첫째 날로 조정한다.
        //  - firstInMonth : 주어진 요일 중 해당 월의 첫 번째 요일로 조정한다.
        //  - lastDayOfMonth : 해당 월의 마지막 날로 조정한다.
        //  - lastDayOfNextMonth : 다음 달의 마지막 날로 조정한다.
        //  - lastDayOfNextYear : 다음 해의 마지막 날로 조정한다.
        //  - lastDayOfYear : 해당 해의 마지막 날로 조정한다.
        //  - lastInMonth : 주어진 요일 중 해당 월의 마지막 요일로 조정한다.
        //  - next : 주어진 요일 이후의 가장 가까운 요일로 조정한다
        //  - nextOrSame : 주어진 요일 이후의 가장 가까운 요일로 조정하되, 현재 날짜가 주어진 요일인 경우 현재 날짜를 반환한다.
        //  - previous : 주어진 요일 이전의 가장 가까운 요일로 조정한다.
        //  - previousOrSame : 주어진 요일 이전의 가장 가까운 요일로 조정하되, 현재 날짜가 주어진 요일인 경우 현재 날짜를 반환한다.
    }
}
