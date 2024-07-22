package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    // 문자열을 날짜와 시간으로 파싱
    public static void main(String[] args) {
        // 포맷팅 : 날짜와 시간을 문자로 변환
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        
        // 자주 사용하는 포맷
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 : " + formattedDateTime);

        // 파싱 : 문자를 날짜와 시간으로 변환
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 : " + parsedDateTime);

        // LocalDateTime과 같은 날짜와 시간 객체를 원하는 형태의 문자로 변경하려면 DateTimeFormatter를 사용하면 된다.
        // 여기에 ofPattern()으로 만들어 두었던 포맷(원하는 포맷)을 지정하면 된다.
    }
}
