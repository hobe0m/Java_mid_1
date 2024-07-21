package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);

        // LocalDateTime에 Offset 정보를 추가해 OffsetDateTime으로 바꿀 수 있다.
        // 이 때, ZoneOffset.of("오프셋 아이디")를 사용한다.
        // ZoneOffset은 +01:00처럼 UTC와의 시간 차이인 오프셋 정보만 보관한다.
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);

        // ZonedDateTime vs OffsetDateTime
        // ZonedDateTime 은 구체적인 지역 시간대를 다룰 때 사용하며, 일광 절약 시간을 자동으로 처리할 수 있다.
        // 따라서 사용자 지정 시간대에 따른 시간 계산이 필요할 때 적합하다.
        // OffsetDateTime 은 UTC와의 시간 차이만을 나타낼 때 사용하며, 지역 시간대의 복잡성을 고려하지 않는다.
        // 따라서 시간대 변환 없이 로그를 기록하고, 데이터를 저장하고 처리할 때 적합하다

        // 참고
        // ZonedDateTime 이나 OffsetDateTime 은 글로벌 서비스를 하지 않으면 잘 사용하지 않는다. 
        // 따라서 너무 깊이있게 파기 보다는 대략 이런 것이 있다 정도로만 알아두면 된다. 
        // 만일 실무에서 개발하면서 글로벌 서비스를 개발할 기회가 있다면 그때 필요한 부분을 찾아서 깊이있게 학습하면 된다.
    }
}
