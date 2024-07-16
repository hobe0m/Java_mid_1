package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple, banana, mango";

        String[] splitFruits = fruits.split(", ");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        // join()은 String.join으로 접근(연결할 문자열 + 문자열 배열)
        String joinedString = String.join("-> ", splitFruits);
        System.out.println("joinedString = " + joinedString);
    }
}
