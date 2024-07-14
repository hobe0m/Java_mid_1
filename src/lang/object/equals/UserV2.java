package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    // equals()
    // 2. 구현(오버라이딩)
       private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // obj 타입에는 id가 없기 때문에 다운캐스팅을 해주어야 한다.
        return id.equals(user.id); // 첫 번째 id가 this.id이다.
    }
    */

    // Object의 equals() 메서드 재정의
    // UserV2의 동등성은 id(고객번호)로 비교한다.
    // eqauls()는 Object 타입을 매개변수로 사용하기 때문에 객체의 특정 값을 사용하려면 다운캐스팅이 필요하다.
    // 여기서는 현재 인스턴스(this)에 있는 id 문자열과 비교 대상으로 넘어온 객체의 id 문자열을 비교한다.
    // UserV2에 있는 id는 String이므로 문자열 비교는 ==가 아닌 equals()를 사용해야 한다.

    // 정확한 equals()의 구현

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

    // 해시코드 부분도 자동으로 만들어지지만 지금은 사용하지 않으므로 지운다.

    // equals() 메서드를 구현할 때 지켜야 하는 규칙(5가지, 외울 필요 X)
    // 반사성(Reflexivity): 객체는 자기 자신과 동등해야 한다. ( x.equals(x) 는 항상 true )
    // 대칭성(Symmetry): 두 객체가 서로에 대해 동일하다고 판단하면, 이는 양방향으로 동일해야 한다. ( x.equals(y) 가 true 이면 y.equals(x) 도 true)
    // 추이성(Transitivity): 만약 한 객체가 두 번째 객체와 동일하고, 두 번째 객체가 세 번째 객체와 동일하다면, 첫번째 객체는 세 번째 객체와도 동일해야 한다.
    // 일관성(Consistency): 두 객체의 상태가 변경되지 않는 한, equals() 메소드는 항상 동일한 값을 반환해야한다.
    // null에 대한 비교: 모든 객체는 null 과 비교했을 때 false 를 반환해야 한다.

    // 정리
    // 참고로 동등성 비교가 항상 필요한 것은 아니므로 동등성 비교가 필요한 경우에만 eqauls()를 재정의하면 된다.
    // eqauls()와 hashCode()는 보통 함께 사용된다.
    //  - 이 부분은 뒤에 컬렉션 프레임워크에서 자세히 설명한다.
}
