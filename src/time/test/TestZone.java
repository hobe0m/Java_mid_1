package time.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime asiaSeoul = ZonedDateTime.of(2024, 1, 1, 9, 0, 0, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("서울의 회의 시간 : " + asiaSeoul);

        ZonedDateTime europeLondon = asiaSeoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런던의 회의 시간 : " + europeLondon);

        ZonedDateTime americaNewYork = asiaSeoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕의 회의 시간 : " + americaNewYork);

    }
}
