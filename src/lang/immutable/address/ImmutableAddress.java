package lang.immutable.address;

public class ImmutableAddress {
    // 불변 객체의 도입
    // 지금까지 발생했던 문제의 원인은 공유된 객체의 값을 변경한 것에 있다.

    // a와 b가 처음에는 서울이여야 하고, 이후에 b를 부산으로 변경해야 한다.
    // 여기까지는 Address b = a와 같이 공유 참조를 사용해도 아무런 문제가 없고 오히려 더 효율적이다.
    // 문제는 이후에 b가 공유 참조하는 인스턴스에 값을 변경하기 때문에 발생한다.
    // 따라서 Address 객체의 값을 변경하지 못하게 설계했다면 이런 사이드 이펙트 자체가 발생하지 않을 것이다.

    // 불변 객체의 사용
    // 객체의 상태(객체 내부의 값, 필드, 멤버 변수)가 변하지 않는 객체를 불변 객체(Immutable Object)라고 한다.
    // 내부 값이 변경되면 안되므로 value 필드를 final로 선언하고 값을 변경할 수 있는 serValue()를 제거한다.
    // 따라서 이 클래스는 생성자를 통해서만 값을 설정할 수 있고, 이후에는 변경이 불가능하다.
    // 불변 클래스를 만드는 방법은 아주 단순하다.
    //  - 어떻게든 필드 값을 변경할 수 없게 설계하면 되는 것이다.
    private final String value; // 여기서는 final(의도를 명확하게 하기 위해 사용)이 없어도 setValue가 없으므로 값을 변경하지 못한다.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
