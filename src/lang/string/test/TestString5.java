package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        // str의 .txt가 시작하는 인덱스 위치를 변수에 저장
        int extIndex = str.indexOf(ext);

        String fileName = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("fileName : " + fileName);
        System.out.println("extName : " + extName);
    }
}
