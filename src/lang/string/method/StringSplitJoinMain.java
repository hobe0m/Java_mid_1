package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {

        String str = "Apple, Banana, Orange";

        // split()
        String[] splitStr = str.split(", ");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join() 사용 전, 매우 복잡하다.
        String joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if (i != splitStr.length -1) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " + joinStr);

        // join()
        String joinedStr1 = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 : " + joinedStr1);

        // 문자열 배열 연결 1
        String joinedStr2 = String.join(" - ", "Apple", "Banana", "Orange");
        System.out.println("연결된 문자열 : " + joinedStr2);

        // 문자열 배열 연결 2, join에는 문자열 배열도 들어갈 수 있다.
        String result = String.join(" - ", splitStr);
        System.out.println("result : " + result);
    }
}
