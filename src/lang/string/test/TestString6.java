package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        // indexOf()로 없는 문자열을 찾으면 -1이 반환된다.
        int index = str.indexOf(key); // indexOf(String ch, int fromIndex); : 문자열이 처음 등장하는 위치를 반환

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count : " + count);
    }
}
