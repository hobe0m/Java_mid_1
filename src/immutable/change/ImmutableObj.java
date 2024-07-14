package immutable.change;

public class ImmutableObj {
    // 불변 객체 사용

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result);
        // return new ImmutableObj(value + addValue); 로도 사용 가능
    }

    public int getValue() {
        return value;
    }
}
