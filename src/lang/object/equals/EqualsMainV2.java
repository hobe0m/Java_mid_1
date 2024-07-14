package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity : " + (user1 == user2));
        System.out.println("eqaulity : " + (user1.equals(user2)));

        // 동일성은 다르지만, 동등성은 같다.

        // 정확한 equals()의 구현은 생각보다 쉽지 않다.
        // UserV2에서 구현한 equals()는 이해를 돕기 위해 만든 매우 간단한 버전이다.
        // 그래서 Intellij를 포함한 대부분의 IDE는 equals() 코드를 자동으로 만들어 준다.
        // alt + insert를 사용하여 만들면 된다.
    }
}
