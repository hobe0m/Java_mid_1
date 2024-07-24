package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            LocalDate plusWeekDate = date.plus(2 * i, ChronoUnit.WEEKS);
            System.out.println("날짜 " + i + ": " + plusWeekDate);
            // plusWeeks를 사용해서 구하는 방법도 있다.
            //  - ChronoUnit.WEEKS 사용 X
        }
    }
}
