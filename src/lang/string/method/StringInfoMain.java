package lang.string.method;

public class StringInfoMain {
    // String 클래스
    // 주요 메서드 1
    // String에서 제공하는 다양한 메서드 중 자주 사용하는 기능 나열
    // 외우기 보다는 이런 메서드가 있구나 하고, 필요할 때 검색하거나 API 문서를 통해 원하는 기능을 찾는 것이 바람직하다.

    // 문자열 정보 조회
    //  - length() : 문자열의 길이를 반환한다.
    //  - isEmpty() : 문자열이 비어 있는지 확인한다. (길이가 0)
    //  - isBlank() : 문자열이 비어 있는지 확인한다. (길이가 0이거나 공백(Whitespace)만 있는 경우), 자바 11
    //  - charAt(int index) : 지정된 인덱스에 있는 문자를 반환한다

    // 문자열 비교
    //  - equals(Object anObject) : 두 문자열이 동일한지 비교한다.
    //  - equalsIgnoreCase(String anotherString) : 두 문자열을 대소문자 구분 없이 비교한다.
    //  - compareTo(String anotherString) : 두 문자열을 사전 순으로 비교한다.
    //  - compareToIgnoreCase(String str) : 두 문자열을 대소문자 구분 없이 사전적으로 비교한다.
    //  - startsWith(String prefix) : 문자열이 특정 접두사로 시작하는지 확인한다.
    //  - endsWith(String suffix) : 문자열이 특정 접미사로 끝나는지 확인한다.

    // 문자열 검색
    //  - contains(CharSequence s) : 문자열이 특정 문자열을 포함하고 있는지 확인한다.
    //  - indexOf(String ch) / indexOf(String ch, int fromIndex) : 문자열이 처음 등장하는 위치를 반환한다.
    //  - lastIndexOf(String ch) : 문자열이 마지막으로 등장하는 위치를 반환한다.

    // 문자열 조작 및 변환
    // - substring(int beginIndex) / substring(int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환한다.
    // - concat(String str) : 문자열의 끝에 다른 문자열을 붙인다.
    // - replace(CharSequence target, CharSequence replacement) : 특정 문자열을 새 문자열로 대체한다.
    // - replaceAll(String regex, String replacement) : 문자열에서 정규 표현식과 일치하는 부분을 새 문자열로 대체한다.
    // - replaceFirst(String regex, String replacement) : 문자열에서 정규 표현식과 일치하는 첫 번째 부분을 새 문자열로 대체한다.
    //  - 정규 표현식에 대해서는 찾아보면 된다.
    // - toLowerCase() / toUpperCase() : 문자열을 소문자나 대문자로 변환한다.
    // - trim() : 문자열 양쪽 끝의 공백을 제거한다. 단순 Whitespace 만 제거할 수 있다.
    // - strip() : Whitespace 와 유니코드 공백을 포함해서 제거한다. 자바 11

    // 문자열 분할 및 조합
    // - split(String regex) : 문자열을 정규 표현식을 기준으로 분할한다.
    // - join(CharSequence delimiter, CharSequence... elements) : 주어진 구분자로 여러 문자열을 결합한다

    // 기타 유틸리티
    // - valueOf(Object obj) : 다양한 타입을 문자열로 변환한다.
    // - toCharArray(): 문자열을 문자 배열로 변환한다.
    // - format(String format, Object... args) : 형식 문자열과 인자를 사용하여 새로운 문자열을 생성한다.
    // - matches(String regex) : 문자열이 주어진 정규 표현식과 일치하는지 확인한다.

    // 참고
    // CharSequense는 String, StringBuilder의 상위 타입이다.
    // 따라서 문자열을 처리하는 다양한 객체를 받을 수 있다.
    // StringBuilder는 뒤에서 설명한다.
    public static void main(String[] args) {
        String str = "Hello, java!";
        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열이 비어 있는지 : " + str.isEmpty());
        System.out.println("문자열이 비어 있거나 공백인지(1) : " + str.isBlank());
        System.out.println("문자열이 비어 있거나 공백인지(2) : " + "     ".isBlank());
        // isBlank()는 비어있거나 공백인 경우 모두에 사용 가능

        char c = str.charAt(7);
        System.out.println("7번 인덱스의 문자 : " + c);
    }
}
