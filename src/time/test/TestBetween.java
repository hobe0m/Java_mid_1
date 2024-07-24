package time.test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        // D-Day를 구할 때, between은 ChronoUnit으로 기준이 되는 단위를 먼저 적어주고 비교할 두 개의 날짜나 시간을 적어준다.
        long betweenDays = ChronoUnit.DAYS.between(startDate, endDate);

        // 기간을 구할 때, between은 Period.between을 사용하여 구한다.
        Period betweenPeriod = Period.between(startDate, endDate);

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);
        System.out.println("남은 기간 : " + betweenPeriod.getYears() +"년 " + betweenPeriod.getMonths() + "개월 " + betweenPeriod.getDays() + "일");
        System.out.println("디데이 : " + betweenDays + "일 남음");
    }
}
