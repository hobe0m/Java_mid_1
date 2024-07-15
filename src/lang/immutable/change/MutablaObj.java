package lang.immutable.change;

public class MutablaObj {
    // 불변 객체의 값 변경
    // 불변 객체를 사용하지만 그래도 값을 변경해야 하는 메서드가 필요할 때는 어떻게 해야 할까?
    // 가변 객체 사용
    private int value;

    public MutablaObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value = value + addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
