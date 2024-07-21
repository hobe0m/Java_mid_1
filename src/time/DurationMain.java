package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    // Duration
    // 두 시간 사이의 간격을 시, 분, 초(나노초) 단위로 나타낸다.
    //  - 내부에는 초 데이터밖에 없기 때문에 시, 분은 계산 후 사용한다.
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        // 1시간이라는 LocalTime 생성
        // of(지정)
        // ofSeconds()
        // ofMinutes()
        // ofHours()
        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간 : " + plusTime);
        
        // 시간 차이
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("차이 : " + between.getSeconds() + "초");
        // toMinute()는 시간까지 분으로 환산해서 반환, toMinutePart()는 60분이 넘으면 시간으로 계산 후 남은 분만 반환
        System.out.println("근무 시간 : " + between.toHours() + "시간 " + between.toMinutesPart() + "분");

    }
}
