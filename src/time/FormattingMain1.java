package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    // 날짜와 시간 문자열 파싱과 포맷팅
    //  - 포맷팅 : 날짜와 시간 데이터를 원하는 포맷의 문자열로 변경하는 것
    //   - Date -> String
    //  - 파싱 : 문자열을 날짜와 시간 데이터로 변경하는 것
    //   - String -> Date
    public static void main(String[] args) {
        // 포맷팅(날짜 -> 문자)
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        // 이러한 출력 방법은 너무 길기 때문에 포맷팅을 사용해야 한다.
        System.out.println(date.getYear() + "년 " + date.getMonthValue() + "월 " + date.getDayOfMonth() + "일");

        // DateTimeFormatter의 ofPattern() 메서드로 원하는 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

        // 그리고 원하는 날짜를 format(만들어 둔 포맷) 메서드로 변환
        String formatDate = date.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formatDate);

        // 파싱, 문자를 날짜로 변경
        // 문자열 날짜 생성
        String input = "2030년 01월 01일";
        
        // LocalDated의 parse(바꿔줄 문자열, 만들어 둔 포맷) 메서드를 사용하여 변환 
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println("문자열 파싱 날짜와 시간 = " + parsedDate);
    }

    // LocalDate와 같은 날짜 객체를 원하는 형태의 문자로 변경하려면 DateTimeFormatter를 사용하면 된다.
    // 여기에 ofPattern()으로 원하는 포맷을 지정해서 사용하면 된다.

    // DateTimeFomatter 패턴의 공식 사이트 링크
    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns

    // m은 분, M은 달이다.
    // 이런 것들이 헷갈릴 때 가서 보고 참고하면 된다.
}
