package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // int, boolean, double과 같이 소문자로 시작하는 것은 기본형
        // String 같이 대문자로 시작하는 것은 참조형
        
        String str1 = "hello";
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 쌍따옴표를 사용하는 방법과 객체를 생성하는 방법이 있다.
        //  - 쌍따옴표 사용 : "hello"
        //  - 객체 생성 new String("hello")

        // String은 클래스이기 때문에 사실 String str1 = "hello"; 코드는 뭔가 어색하다.
        // 참조형을 기본형처럼 사용하고 있기 때문이다.
        
        // 문자열은 자바에서 매우 자주 사용된다.
        // 그래서 편의상 쌍따옴표로 문자열을 감싸면 자바 언어에서 new String("hello")와 같이 변경해준다.
        //  - 이 경우 실제로는 성능 최적화를 위해 문자열 풀을 사용하는데, 이 부분은 뒤에서 설명한다.
        //  - String str1 = "hello"; 기존 코드
        //  - String str1 = new String("hello"); 자바가 자동으로 변경한 코드

        // 실제 String 클래스의 내부(대략적)

        // 필드
        // private final char[] value; (자바 9 이전)
        // private final byte[] value; (자바 9 이후)
        // 즉, 문자를 배열 형태로 담는 필드를 가진다.
        // 따라서 String 클래스는 개발자가 직접 다루기 불편한 char[]을 내부에 감추고 String 클래스를 사용하는 개발자가 편리하게 문자열을 다룰 수 있는 다양한 기능을 제공한다.
        // 그리고 메서드 제공을 넘어서 자바 언어 차원에서도 여러 편의 문법을 제공한다.
        // char[](byte[])라는 단순한 데이터 조각에 여러 기능을 부여해 객체로 쓸 수 있게 해주는 것이다.

        // 참고 자바 9 이후 String 클래스의 변경 사항
        // 자바 9 이후부터는 char[]가 아닌 byte[]를 사용한다.
        // 그 이유는 숫자나 영어는 1byte로 표현이 가능하기 때문에 단순히 영어랑 숫자로 표현(정확히는 Latin-1 인코딩)된 경우에는 1byte를 사용해 메모리를 더 효율적으로 사용하기 위함이다.
        // 그게 아니라면 2byte인 UTF-16 인코딩을 사용한다.
        // 한글이 포함되어 있으면 UTF-16 인코딩을 쓰는 것이다.

        // String 클래스의 기능(메서드)
        // String 클래스는 문자열로 처리할 수 있는 방대한 기능을 제공하므로 필요한 기능이 있다면 검색하거나 API 문서를 찾아보면 된다.
        //  - length() : 문자열의 길이를 반환한다.
        //  - chatAt(int index) : 특정 인덱스의 문자를 반환한다
        //  - substring(int beginIndex, int endIndex) : 문자열의 부분 문자열을 반환한다.
        //  - indexOf(String str) : 특정 문자열이 시작되는 인덱스를 반환한다.
        //  - toLowerCase() , toUpperCase() : 문자열을 소문자 또는 대문자로 변환한다
        //  - trim() : 문자열 양 끝의 공백을 제거한다.
        //  - concat(String str) : 문자열을 더한다.
    }
}
