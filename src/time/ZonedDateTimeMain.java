package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    // ZonedDateTime
    // ZonedDateTime은 LocalDateTime에 시간대 정보인 ZoneId가 합쳐진 것이다.

    // ZonedDateTime : 시간대를 고려한 날짜와 시간을 표현할 때 사용, 여기에는 시간대를 표현하는 타임존이 포함된다.
    //  - 예) 2013-11-21T08:20:30.213+9:00[Asia/Seoul]
    //  - +9:00은 UTC(협정 세계시)로 부터의 시간대 차이이며 오프셋이고 한국은 UTC보다 +9:00 시간이라는 뜻이다.
    // Asia/Seoul은 타임존이고 이 타임존을 알면 오프셋도 알 수 있으며 +9:00 같은 오프셋 정보도 타임존에 포함된다.
    // 추가로 ZoneId 를 통해 타임존을 알면 일광 절약 시간제에 대한 정보도 알 수 있어 일광 절약 시간제가 적용된다.
    public static void main(String[] args) {
        // ZonedDateTime을 사용하는 방법들
        
        // 지정 없이 그냥 타임존을 호출하면, 시스템 디폴트 값이 반환된다.
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        // LocalDateTime에 타임존의 존 아이디를 입력해서, ZonedDateTime으로 바꿀 수 있다.
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        // ZonedDateTime의 of 메서드로 ZonedDateTime을 만들 때는, 나노 세컨드와 ZoneId까지 넣어주면 된다.
        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        // ZonedDateTime에 withZoneSameInstant(ZoneId.of(알고 싶은 타임존)을 통해 다른 타임존의 시간도 구할 수 있다.
        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt);

        // withZoneSameInstant(ZoneId) : 타임존 변경, 타임존에 맞추어 시간도 변경

        // OffSetDateTime
        // LocalDateTime에 UTC 오프셋 정보인 ZoneOffset이 합쳐진 것이다.
        // 시간대를 고려한 날짜와 시간을 표현할 때 사용, 타임존은 없고, UTC로부터의 시간대 차이인 고정된 오프셋만 포함
        //  - 예) 2013-11-21T08:20:30.213+9:00
        //  - ZoneId가 없으므로 일광 절약 시간제가 적용되지 않는다.
    }
}
