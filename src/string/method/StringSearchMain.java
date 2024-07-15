package string.method;

public class StringSearchMain {
    public static void main(String[] args) {

        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java'가 포함되어 있는지 : " + str.contains("Java"));
        System.out.println("Java의 첫 번째 인덱스 : " + str.indexOf("Java")); // Java가 등장하는 첫 번째 인덱스
        System.out.println("인덱스 10번부터 'Java'의 인덱스 : " + str.indexOf("Java", 10)); // 10번쨰 인덱스부터 확인
        System.out.println("'Java'의 마지막 인덱스(끝에서부터 'Java' 찾기) : " + str.lastIndexOf("Java")); // 문자열에 끝에서부터 Java 찾기
    }
}
