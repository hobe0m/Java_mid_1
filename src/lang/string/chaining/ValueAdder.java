package lang.string.chaining;

public class ValueAdder {
    // 메서드 체이닝(Method Chaining)

    private int value;

    // 단순히 값을 누적해서 더하는 기능을 제공하는 클래스
    // add() 메서드를 호출할 때마다 내부의 value에 값을 누적
    // add() 메서드를 보면 자기 자신(this)의 참조값을 반환
    //  - 이 부분 유의
    public ValueAdder add(int addValue) {
        value += addValue;
        return this;
    }

    public int getValue() {
        return value;
    }
}
