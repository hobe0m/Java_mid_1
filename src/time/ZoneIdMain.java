package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    // 타임존, ZonedDateTime
    // Asia / Seoul과 같은 타임존 안에는 일광 절약 시간제에 대한 정보와 UTC + 9:00과 같은 UTC로 부터의 시간 차이인 오프셋 정보를 모두 포함하고 있다.

    // 타임존 목록 예시
    // Europe/London
    // GMT
    // UTC
    // US/Arizona -07:00
    // America/New_York -05:00
    // Asia/Seoul +09:00
    // Asia/Dubai +04:00
    // Asia/Istanbul +03:00
    // Asia/Shanghai +08:00
    // Europe/Paris +01:00
    // Europe/Berlin +01:00
    public static void main(String[] args) {
        // ZoneId.getAvailableZoneIds() : 시스템에서 사용할 수 있는 모든 시간대의 목록 즉, 이용 가능한 ZoneId의 목록 반환
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zondId = ZoneId.of(availableZoneId);
            // ZoneId.getRules() : 해당 시간대의 규칙을 반환(시간대가 적용되는 표준 시간, 일광 절약 시간, 오프셋 등)
            System.out.println(zondId + " | " + zondId.getRules());
        }

        // ZoneId.systemDefault() : 현제 운영체제에서 사용하고 있는 zondId 반환
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault : " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);

        // 생성
        //  - ZoneId.systemDefault() : 시스템이 사용하는 기본 ZoneId 를 반환한다.
        //   - 각 PC 환경 마다 다른 결과가 나올 수 있다.
        //  - ZoneId.of(타임존) : 타임존을 직접 제공해서 ZoneId 를 반환한다.

        // ZoneId 는 내부에 일광 절약 시간 관련 정보, UTC와의 오프셋 정보를 포함하고 있다.
    }
}
