package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    // ChronoUnit을 사용하면 두 날짜 또는 시간 사이의 차이를 해당 단위로 쉽게 계산할 수 있다.

    // 시간 필드, ChronoField
    // ChronoField는 날짜 및 시간을 나타내는 데 사용되는 열거형
    // 이 열거형은 다양한 필드를 통해 날짜와 시간의 특정 부분을 나타낸다.
    // 여기에는 연도, 월, 일, 시간, 분 등이 포함된다.

    // TemporalField 인터페이스는 날짜와 시간을 나타내는데 사용된다.
    // 주로 사용되는 구현체는 java.time.temporal.ChronoField 열거형으로 구현되어 있다.
    // ChronoField는 다양한 필드를 통해 날짜와 시간의 특정 부분을 나타낸다.
    // 여기에는 연도, 월, 일, 시간, 분 등이 포함된다.
    // 여기서 필드(Field)라는 뜻이 날짜와 시간 중에 있는 특정 필드들을 뜻한다.
    // 참고
    // 예를 들어 2024년 8월 16일이라고 하면 각각의 필드는 다음과 같다.
    // YEAR : 2024
    // MONTH_OF_YEAR : 8
    // DAY_OF_MONTH : 16
    // 단순히 시간의 단위 하나하나를 뜻하는 ChronoUnit과는 다르다.
    // ChronoField를 사용해야 날짜와 시간의 각 필드 중에 원하는 데이터를 조회할 수 있다.

    // 연도 관련 필드
    //  - ERA : 연대, 예를 들어 서기(AD) 또는 기원전(BC)
    //  - YEAR_OF_ERA : 연대 내의 연도
    //  - YEAR : 연도
    //  - EPOCH_DAY : 1970-01-01부터의 일 수

    // 월 관련 필드
    //  - MONTH_OF_YEAR : 월 (1월 = 1)
    //  - PROLEPTIC_MONTH : 연도를 월로 확장한 값

    // 주 및 일 관련 필드
    //  - DAY_OF_WEEK : 요일 (월요일 = 1)
    //  - ALIGNED_DAY_OF_WEEK_IN_MONTH : 월의 첫 번째 요일을 기준으로 정렬된 요일
    //  - ALIGNED_DAY_OF_WEEK_IN_YEAR : 연의 첫 번째 요일을 기준으로 정렬된 요일
    //  - DAY_OF_MONTH : 월의 일 (1일 = 1)
    //  - DAY_OF_YEAR : 연의 일 (1월 1일 = 1)
    //  - EPOCH_DAY : 유닉스 에폭(1970-01-01)부터의 일 수

    // 시간 관련 필드
    //  - HOUR_OF_DAY : 시간 (0-23)
    //  - CLOCK_HOUR_OF_DAY : 시계 시간 (1-24)
    //  - HOUR_OF_AMPM : 오전/오후 시간 (0-11)
    //  - CLOCK_HOUR_OF_AMPM : 오전/오후 시계 시간 (1-12)
    //  - MINUTE_OF_HOUR : 분 (0-59)
    //  - SECOND_OF_MINUTE : 초 (0-59)
    //  - NANO_OF_SECOND : 초의 나노초 (0-999,999,999)
    //  - MICRO_OF_SECOND : 초의 마이크로초 (0-999,999)
    //  - MILLI_OF_SECOND : 초의 밀리초 (0-999)

    // 기타 필드
    //  - AMPM_OF_DAY : 하루의 AM/PM 부분
    //  - INSTANT_SECONDS : 초를 기준으로 한 시간
    //  - OFFSET_SECONDS : UTC/GMT에서의 시간 오프셋 초

    // 주요 메서드
    //  - getBaseUnit(), 반환 타입 : TemporalUnit
    //   - 필드의 기본 단위를 반환한다.
    //   - 예를 들어, 분 필드의 기본 단위는 ChronoUnit.MINUTES이다.

    //  - getRangeUnit(), 반환 타입 : TemporalUnit
    //   - 필드의 범위 단위를 반환한다.
    //   - 예를 들어, MONTH_OF_YEAR의 범위 단위는 ChronoUnit.YEARS이다.

    //  - isDateBased(), 반환 타입 : boolean
    //   - 필드가 주로 날짜를 기반으로 하는지 여부를 나타냅니다.
    //   - YEAR와 같은 날짜 기반 필드는 true를 반환한다.

    //  - isTimeBased(), 반환 타입 : boolean
    //   - 필드가 주로 시간을 기반으로 하는지 여부를 나타낸다.
    //   -  HOUR_OF_DAY 와 같은 시간 기반 필드는 true를 반환한다.

    //  - range(), 반환 타입 : ValueRange
    //   - 필드가 가질 수 있는 값의 유효 범위를 ValueRange 객체로 반환한다.
    //   - 객체는 최소값과 최대값을 제공한다.

    // 단순한 일과, 년, 월, 일이 존재할 때의 일(31이 제한)은 다르다.

    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println("value : " + value + ", range : " + value.range());
        }

        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());

        // 정리
        // TemporalUnit(ChronoUnit), TemporalField(ChronoField)는 단독으로 사용하기 보다는 주로 날짜와 시간을 조회하거나 조작할 때 사용한다.
    }
}
