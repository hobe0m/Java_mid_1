package time;

public class History {
    // 자바 날짜와 시간 라이브러리의 역사
    //  - 자바는 날짜와 시간 라이브러리를 지속해서 업데이트 해왔다.

    // JDK 1.0(java.util.Date)
    // 문제점
    //  - 타임존 처리 부족 : 초기 Date 클래스는 타임존(time zone)을 제대로 처리하지 못했다.
    //  - 불편한 날짜 시간 연산 : 날짜 간 연산이나 시간의 증감 등을 처리하기 어려웠다.
    //  - 불변 객체 부재 : Date 객체는 변경 가능(mutable)하여, 데이터가 쉽게 변경될 수 있었고 이로 인해 버그가 발생하기 쉬웠다.

    // 해결책
    //  - JDK 1.1에서 java.util.Calendar 클래스 도입으로 타임존 지원 개선.
    //  - 날짜 시간 연산을 위한 추가 메소드 제공.


    // JDK 1.1(java.util.Calendar)
    // 문제점
    //  - 사용성 저하 : Calendar 는 사용하기 복잡하고 직관적이지 않았다.
    //  - 성능 문제 : 일부 사용 사례에서 성능이 저하되는 문제가 있었다.
    //  - 불변 객체 부재 : Calendar 객체도 변경 가능하여, 사이드 이펙트, 스레드 안전성 문제가 있었다.

    // 해결책
    //  - Joda-Time 오픈 소스 라이브러리의 도입으로 사용성, 성능, 불변성 문제 해결.


    // Joda-Time(오픈 소스 라이브러리)
    // 문제점
    //  - 표준 라이브러리가 아님 : Joda-Time은 외부 라이브러리로, 자바 표준에 포함되지 않아 프로젝트에 별도로 추가해야 했다.

    // 해결책
    //  - 자바 8에서 java.time 패키지(JSR-310)를 표준 API로 도입.


    // JDK 8(1.8) (java.time 패키지)
    //  - java.time 패키지는 이전 API의 문제점을 해결하면서, 사용성, 성능, 스레드 안전성, 타임존 처리 등에서 크게 개선되었다.
    //   - 변경 불가능한 불변 객체 설계로 사이드 이펙트, 스레드 안전성 보장, 보다 직관적인 API 제공으로 날짜와 시간 연산을 단순화 했다.
    //  - LocalDate , LocalTime , LocalDateTime , ZonedDateTime , Instant 등의 클래스를 포함한다
    //  - Joda-Time의 많은 기능을 표준 자바 플랫폼으로 가져왔다.


    // 참고
    // 자바가 표준으로 제공했던 Date , Calendar 는 사용성이 너무 떨어지고, 문제가 많은 라이브러리였다.
    // 이런 문제를 해결하기 위해 참다참다 결국 Joda-Time이라는 오픈소스 라이브러리가 등장한다.
    // Joda-Time의 편리함과 사용성 덕분에 이 라이브러리는 크게 대중화 되었다.
    //  자바는 기존 날짜와 시간의 설계를 반성하고, Joda-Time을 만든 개발자를 데려와서 JSR-310(java.time)이라는 새로운 자바 표준 날짜와 시간 라이브러리를 정의한다.
    // 실용적인 Joda-Time에 많은 자바 커뮤니티의 의견을 반영해서 좀 더 안정적이고 표준적인 날짜와 시간 라이브러리인 java.time 패키지가 성공적으로 완성되었다.
    // 참고로 자바 표준 ORM 기술인 JPA도 비슷한 역사를 가지고 있다.
    // 과거 자바가 표준으로 제공하는 ORM 기술이 너무 불편해서, 누군가 하이버네이트라는 ORM 오픈 소스를 만들었는데, 이 기술이 자바 표준 ORM 기술보다 더 대중화되었다.
    // 자바는 하이버네이트를 만든 개발자를 대려와서 새로운 자바 ORM 기술 표준을 만들었는데, 이것이 바로 JPA이다.

    // 이러한 연유로 java.time , JPA 모두 큰 성공을 거두고 자바의 메인 표준 기술로 완전히 자리 잡았다.
}
