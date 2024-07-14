package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // 인스턴스가 다르므로 false
        System.out.println("identity : " + (user1 == user2));

        // 결과가 왜 false로 나타나는가?
        // Object가 기본으로 제공하는 equals()는 ==(동일성 비교)과 동일하기 때문이다.
        // 따라서 오버라이딩을 해야한다.
        System.out.println("equality : " + (user1.equals(user2)));

        // 동등성이라는 개념은 각각의 클래스마다 다르다.
        // 주민등록번호, 연락처 등등 여러 기준으로 동등성을 처리할 수 있는 것이다.
        // 따라서 동등성 비교를 사용하고 싶으면 equals() 메서드를 재정의 해야 한다.
        // 그렇지 않으면 Object는 eqauls() 사용 시 동일성 비교를 기본으로 제공한다.
    }
}
