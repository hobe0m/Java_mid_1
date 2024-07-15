package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 불변 객체의 값을 변경하고 싶다면, 새로운 객체를 생성해서 메서드에서 리턴되는 값을 받아줘야 한다.
    // 불변 객체로 생성한 객체의 값은 변경할 수 없기 때문이다.
    // 불변 객체에서 값을 변경하는 경우 메서드 생성 시 값의 앞에 with를 붙여주는 경우가 많다.
    // 이는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함한다는 뜻이다.
    public ImmutableMyDate withYear(int newYear) {
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + " - " + month + " - " + day;
    }
}
