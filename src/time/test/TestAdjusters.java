package time.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        // 입력 받은 년과 월의 첫 날 요일과 마지막 날 요일을 구해라
        int year = 2024;
        int month = 1;

        // LocalDate 형식으로 만들어주기, getDayOfWeek()를 사용하기 위함
        // 1월 1일의 요일을 알아야 하기 때문에 dayOfMonth를 1로 지정
        // 마지막날도 지정해서 하려면 해당 년도와 월의 마지막날이 언제인지 알고 있어야 함
        LocalDate date = LocalDate.of(year, month, 1);

        // 1월 1일의 요일 확인
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();

        // TemporalAdjusters.lastDayOfmonth()를 통해 먼저 해당 월의 마지막 날짜를 구하고, getDayOfWeek()를 통해 요일을 구한다.
        DayOfWeek LastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("LastDayOfWeek = " + LastDayOfWeek);
    }
}
