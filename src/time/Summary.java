package time;

public class Summary {
    // 날짜와 시간의 주요 메서드 정리
    
    // LocalDateTime의 주요 메서드
    
    // 생성(Creation)
    // now() : 현재 시간대의 날짜와 시간을 가지는 LocalDateTime 인스턴스를 반환
    
    // of(int year, int month, int dayOfMonth, int hour, int minute) : 주어진 날짜와 시간으로 LocalDateTime 인스턴스를 생성
    //  - 이 때 day가 dayOfMonth인 이유는 31일 이상 즉, 한달이 되는 일은 달로 넘기고 그 나머지 일들만 반환하기 때문이다.
    
    // of(int year, int month, int dayOfMonth, int hour, int minute, int second) : 초까지 포함

    // of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond) : 나노초까지 포함

    // of(LocalDate, LocalTime) : LocalDate와 LocalTime을 결합하여 LocalDateTime 인스턴스 생성

    // from(TemporalAccessor temporal) : 다른 시간 객체로부터 ZonedDateTime 객체를 생성한다.
    //  - 즉, Local, Zoned, Instant 간의 변환을 해주는 메서드이다.
    //  - 이 때, 시간대 정보가 필요한 경우에는 직접 지정해주어야 한다.

    // 변환(Conversion)
    // toLocalDate() : LocalDateTime 인스턴스의 날짜 부분을 LocalDate로 반환한다.

    // toLocalTime() : LocalDateTime 인스턴스의 시간 부분을 LocalTime로 반환한다.

    // toEpochSecond(ZoneOffset offset) : 주어진 시간대 오프셋을 사용하여 에포크 초로 변환한다.
    //  - Epoch Time(에포크 시간) : 1970년 1월 1일 00:00:00 (UTC 기준)으로부터 현재까지의 시간을 초 단위로 계산한 값
    //  - Offset(오프셋) : 오프셋은 UTC(협정 세계 시)와 다른 시간대를 의미, +09:00은 한국 표준 시

    // 시간대 관련(Time-Zone)
    // atZone(ZoneId zone) : 지정된 시간대를 사용하여 ZonedDateTime 인스턴스를 생성한다.

    // 조회(Query)
    // get(TemporalField field) : 지정된 필드를 반환하고, 주로 ChronoField를 사용한다.
    // getYear() : 연도를 반환한다.
    // getMonth() : 월을 반환한다.
    // getDayOfMonth() : 일(월의 몇 번째 날)을 반환한다.
    // getDayOfWeek() : 요일을 반환한다.
    // getHour() : 시간을 반환한다.
    // getMinute() : 분을 반환한다.
    // getSecond() : 초를 반환한다.
    // getNano() : 나노초를 반환한다.

    // 비교(Comparison)
    // isBefore(LocalDateTime other) : 다른 LocalDateTime보다 이전인지 비교한다.
    // isAfter(LocalDateTime other) : 다른 LocalDateTime보다 이후인지 비교한다.
    // isEqual(LocalDateTime other) : 다른 LocalDateTime과 같은지 비교한다.
    //  - 이 때, 시간을 기준으로 비교하기 때문에 isEqual를 사용한다.
    //  - isEqual()은 단순히 비교 대상이 시간적으로 같으면 true
    //  - equals()는 객체의 타입, 타임존 등 내부 데이터의 모든 구성요소가 같아야 true
    //   - 즉, 같은 참조값일 때 true

    // 수정(Adjustment)
    // with(TemporalField field, long newValue) : 지정된 필드를 새 값으로 변경한다.
    // with(TemporalAdjuster adjuster) : 제공된 조정기를 사용하여 날짜를 조정한다.
    // withYear(int year) : 연도를 수정한다.
    // withMonth(int month) : 월을 수정한다.
    // withDayOfMonth(int dayOfMonth) : 일(월의 몇 번째 날)을 수정한다.
    // withHour(int hour) : 시간을 수정한다.
    // withMinute(int minute) : 분을 수정한다.
    // withSecond(int second) : 초를 수정한다.
    // wihtNano(int nanoOfSecond) : 나노초를 수정한다.

    // 추가(Addition)
    // plus(long amountToAdd, TemporalUnit unit) : 지정된 시간 단위로 시간을 더한다.
    // plus(TemporalAmount amountToAdd) : 주어진 시간만큼 더한다.
    // plusYears(long years) : 연을 더한다.
    // plusMonths(long months) : 월을 더한다.
    // plusWeeks(long weeks) : 주를 더한다.
    // plusDays(long days) : 일수를 더한다.
    // plusHours(long hours) : 시간을 더한다.
    // plusMinutes(long minutes) : 분을 더한다.
    // plusSeconds(long seconds) : 초를 더한다.
    // plusNanos(long nanos) : 나노초를 더한다.
    // plusxxx()와 동일하게, minusxxx()가 존재한다.

    // 포맷팅(Formatting)
    // format(DateTimeFormatter formatter) : 주어진 포매터를 사용하여 LocalDateTime을 문자열로 반환한다.

    // ZonedDateTime의 주요 메서드
    //  - LocalDateTime과 중복되는 내용은 제외한다.

    // 생성 및 변환
    // now() : 현재 시간대의 현재 날짜와 시간을 가진 ZonedDateTime 객체를 생성한다.
    // not(ZoneId zond) : 지정된 시간대의 현재 날짜와 시간을 가진 ZonedDateTime 객체를 생성한다.
    // of(LocalDate date, LocalTime time, ZoneId zond) : 주어진 날짜, 시간, 시간대로 ZonedDateTime 객체를 생성한다.
    // of(LocalDateTime dateTime, ZoneId zone) : 주어진 LocalDateTime과 시간대로 ZonedDatetime 객체를 생성한다.
    // of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoOfSecond, ZoneId zone) : 주어진 날짜, 시간, 나노초, 시간대로 ZonedDateTime 객체를 생성한다.

    // 타임존 관리
    // withZoneSameInstant(ZoneId zone) : 다른 시간대로 시간을 변환하되, 절대 시간(UTC)를 유지한다.
    //  - 즉, 7월 24일 10시를 뉴욕 시간으로 바꿀 때 UTC를 기준으로 하여 시차를 적용한 뉴욕 시간을 표시한다.
    // withZoneSameLocal(ZoneId zone) : 시간대를 변경하되, 로컬 날짜와 시간은 그대로 유지한다.
    //  - 즉, 7월 24일 10시를 뉴욕 시간으로 바꿀 때, 뉴욕의 7월 24일 10시를 반환한다.
    // withEarlierOffsetOverlap() : 겹치는 오프셋(여름 시간제 등)이 있을 때, 이전 오프셋을 사용한다.
    //  - 즉, 서머 타임이 6시부터 7시까지라고 하면 6시를 반환
    // withLaterOffsetOverlap() : 겹치는 오프셋이 있을 때, 나중 오프셋을 사용한다.
    // - 즉, 서머 타임이 6시부터 7시까지라고 하면 7시를 반환

    // 조회
    // getOffset() : 현재 ZonedDateTime의 오프셋을 반환한다.
    //  - +09:00 등 시간을 직접 반환
    // getZone() : 현재 ZonedDateTime의 시간대를 반환한다.
    //  - Asia/Seoul 등 지역을 반환
    
    // 기타 유용한 메서드
    // toLocalDateTime() : ZonedDateTime을 LocalDateTime으로 변환한다.
    // toInstant() : ZonedDateTime을 Instant로 변환한다.
    // toEpochSecond() : 1970-01-01T00:00:00Z부터 현재 ZonedDateTime까지의 초 수를 반환한다.
    
    // Instant의 주요 메서드
    //  - 마찬가지로 LocalDateTime과 중복되는 내용은 제외한다.

    // 생성(Creation)
    // now() : 현재 UTC 기준의 Instant를 반환한다.
    // ofEpochMilli(long epochMilli) : 주어진 에폭시 시간(밀리초)를 기준으로 Instant를 생성한다.
    // ofEpochSecond(long epochSecond) : 주어진 에폭시 시간(초)를 기준으로 Instant를 생성한다.
    // ofEpochSecond(long epochSecond, long nanoAdjustment) : 주어진 에폭시 시간(초)과 나노초 조정값을 기준으로 Instant를 생성한다.

    // 변환(Conversion)
    // atOffset(ZoneOffset offset) : Instant를 OffsetDateTime으로 변환한다.
    // atZone(ZoneId zone) : Instant를 특정 시간대의 ZonedDateTime으로 변환한다.
    // toEpochMilli() : Instant의 에폭시 시간을 밀리초 단위로 반환한다.

    // 조회
    // getEpochSecond() : 에폭시 시간을 초 단위로 변경한다.
    // getNano() : 현재 초의 나나초 부분을 반환한다.

    // 추가
    // Period는 두 날짜 사이의 간격을 년, 월, 일 단위로 나타낸다.
    //  - 즉, 날짜 사이의 간격 반환
    // Duration은 두 시간 사이의 간격을 시, 분, 초 단위로 나타낸다.
    //  - 즉, 시간 사이의 간격 반환

    // 모든 날짜 클래스는 불변이므로 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로 반환값을 꼭 받아야 한다.

    // TemporalAccessor 인터페이스 : 날짜와 시간을 읽기 위한 기본 인터페이스, 특정 시점의 날짜와 시간 정보를 읽을 수 있는 최소한의 정보 제공
    //  - 즉, 읽기 전용
    //  - LocalDateTime, ZonedDateTime, Instant

    // Temporal 인터페이스 : TemporalAccessor의 하위 인터페이스로 날짜와 시간을 조작하기 위한 기능을 제공
    //  - 즉, 읽기와 쓰기(조작) 모두 지원
    //  - LocalDateTime, ZonedDateTime, Instant

    // TemporalAmount 인터페이스 : 시간의 간격(시간의 양, 기간)을 나타내며, 날짜와 시간 객체에 적용하여 객체 조정 가능
    //  - 예를 들어 특정 날짜에 일정 기간을 더하거나 빼는데 사용한다.
    //  - Period, Duration

    // TemporalUnit 인터페이스 : 날짜와 시간을 측정하는 단위를 나타내며, ChronoUnit(열거형) 구현체로 구현된다.
    //  - 즉, 날짜와 시간의 단위를 가지고 있다.

    // TemporalField 인터페이스 : 날짜와 시간을 나타내는데 사용하며, ChronoField(열거형) 구현체를 통해 구현된다.
    //  - 즉, 날짜와 시간의 단위가 아닌 특정 부분을 나타낸다.
    //  - 단순한 시간의 단위 하나하나가 아니고, 특정 부분의 특정 단위를 조회할 수 있다.
    
    // 조회할 때는 ChronoField을, 조작할 때는 ChronoUnit을 사용
    
    // isSupport()를 통해 현재 타입에서 특정 시간 단위나 필드를 사용할 수 있는 지 확인 가능
    //  - 단위가 있는가 혹은 특정 시간에 특정 부분이 있는가
    
    // TemporalAdjusters
    // with은 아주 단순한 날짜만 변결할 수 있으므로, 복잡한 계산 시 사용

}
