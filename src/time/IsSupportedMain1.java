package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;

public class IsSupportedMain1 {
    // 모든 시간 필드를 조회할 수 있는 것은 아니다.
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // 년, 월, 일만 있는데 초를 반환해달라고 하면 예외가 발생, UnSupportedTemporalType
        int minute = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println("minute = " + minute);
    }

    // 이러한 예외를 예방하기 위해 TemporalAccessor와 Temporal 인터페이스는 현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는지 확인할 수 있는 메서드를 제공한다.
}
