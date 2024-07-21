package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    // LocalDateTime
    // LocalDateTime은 LocalDate와 LocalTime을 내부에 가지고 날짜와 시간을 모두 표현한다.
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜와 시간 : " + nowDt);
        System.out.println("지정 날짜와 시간 : " + ofDt);

        // 날짜와 시간을 분리
        // LocalDateTime에 toLocalDate(), toLocalTime()을 사용한다.
        LocalDate localDate = ofDt.toLocalDate(); // 날짜만 분리
        LocalTime localTime = ofDt.toLocalTime(); // 시간만 분리
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);
        
        // 날짜와 시간을 합체
        // LocalDataTime의 of(LocalDate, LocalTime)를 사용한다.
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 계산(불변 주의)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000d : " + ofDtPlus);

        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간 + 1y : " + ofDtPlus1Year);

        LocalDateTime ofDtPlus12Month = ofDt.plusMonths(12);
        System.out.println("지정 날짜 시간 + 12m : " + ofDtPlus12Month);

        // 비교
        // LocalDateTime의 isBefore(), isAfter(), isEqauls()를 사용한다.
        System.out.println("현재의 날짜와 시간이 지정 날짜와 시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재의 날짜와 시간이 지정 날짜와 시간보다 이후인가? " + nowDt.isAfter(ofDt));

        // 동일한 지를 비교할 때, Equals가 아닌 isEquals를 사용해야 하는 이유
        // isEquals() vs equals()

        // isEqual() 는 단순히 비교 대상이 시간적으로 같으면 true 를 반환한다.
        // 객체가 다르고, 타임존이 달라도 시간적으로 같으면 true 를 반환한다.
        // 쉽게 이야기해서 시간을 계산해서 시간으로만 둘을 비교한다.
        //  - 서울의 9시와 UTC의 0시는 시간적으로 같기 때문에 이 둘을 비교하면 true를 반환한다.

        // equals()는 객체의 타입, 타임존 등등 내부 데이터의 모든 구성 요소가 같아야 true를 반환한다.
        //  - 서울의 9시와 UTC의 0시는 시간적으로 같지만 이 둘을 비교할 때 타임존의 데이터가 다르기 때문에 false를 반환한다.

        // 따라서 시간적으로만 비교하고 싶다면, isEquals()를 사용하면 된다.
        System.out.println("현재의 날짜와 시간이 지정 날짜와 시간이 동일한가? " + nowDt.isEqual(ofDt));
    }
}
