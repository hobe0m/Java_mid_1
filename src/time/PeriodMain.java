package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    // 기간(Period), 시간의 간격(Duration)
    // 시간의 개념은 크게 2가지로 표현할 수 있다.
    // 특정 시점의 시간(시각)
    //  - 이 프로젝트는 2013년 8월 16일 까지 완료해야해
    //  - 다음 회의는 11시 30분에 진행한다.
    //  -  생일은 8월 16일이야.
    // 시간의 간격(기간)
    //  - 앞으로 4년은 더 공부해야 해
    //  - 이 프로젝트는 3개월 남았어
    //  - 라면은 3분 동안 끓어야 해

    // Period , Duration 은 시간의 간격(기간)을 표현하는데 사용된다.
    // 시간의 간격은 영어로 amount of time(시간의 양)으로 불린다.

    // Period
    // 두 날짜 사이의 간격을 년, 월, 일 단위로 나타낸다.
    // 사용 대상 : 날짜
    // 단위 : 년, 월, 일
    // 주요 메서드 : getYears(), getMonths(), getDays()

    // Duration
    // 두 시간 사이의 간격을 시, 분, 초(나노초) 단위로 나타낸다.
    // 사용 대상 : 시간
    // 단위 : 시간, 분, 초, 나노초
    // 주요 메서드 : toHours(), toMinutes(), getSeconds(), getNano()
    //  - get은 내가 가지고 있는 속성을 그대로 반환
    //  - to는 일련의 계산을 거친 후 반환
    //   - 즉, Duration은 내부에 초, 나노초의 데이터밖에 없기 때문에 시간과 분은 계산 후 반환한다.
    public static void main(String[] args) {
        // 생성
        // of(년, 월, 일)
        // ofDays()
        // ofMonths()
        // ofYears()
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);

        // 10일이라는 기간을 계산에 사용
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate); // 1일
        System.out.println("plusDate = " + plusDate); // 10일

        // 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        // Period의 between(시작 날짜, 마지막 날짜) 메서드를 사용하여 두 날짜 사이의 기간을 구할 수 있다.
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 : " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
