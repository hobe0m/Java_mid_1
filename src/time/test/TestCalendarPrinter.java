package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();

        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 요일을 구하고 숫자로 치환한 뒤에 7로 나눈 나머지 값(0~6)으로 요일을 구분한다.
        // 월 : 1, 일 : 0 이런 식이다.
        // 해당 월의 첫 번째 날이 무슨 요일인 지 알고 띄워서 입력해야 하기 때문에 사용한다.
        // 이 값만큼 띄워서 입력한다고 생각하면 된다.
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate dayIterator = firstDayOfMonth;
        while (dayIterator.isBefore(firstDayOfNextMonth)) {
            // %2d 를 통해 간격을 맞춘다.
            // 두 칸을 차지하지만 한 자리 수라면 오른쪽에 쓰여진다.
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
