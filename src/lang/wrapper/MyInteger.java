package lang.wrapper;

public class MyInteger {
    // 직접 만든 래퍼 클래스
    // int를 클래스로 만들어보기
    // int는 클래스가 아니지만, int값을 가지고 클래스를 만들면 된다.
    // 이러한 코드는 마치 int를 클래스로 감싸서 만드는 것처럼 보인다고 해서 Wrapper class라고 한다.

    // 클래스를 불변으로 설계
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // compareTo() 메서드를 클래스 내부로 캡슐화
    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // String.valueOf() : 기본 타입 또는 객체를 문자열로 변환하는 메서드
        return String.valueOf(value);
    }
    // MyInteger 클래스는 단순한 데이터 조각인 int를 내부에 품고, 메서드를 통해 다양한 기능을 추가했다.
    // 따라서 int를 MyInteger를 통해 객체로 다룰 수 있게 되었다.
}
