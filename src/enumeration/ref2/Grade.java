package enumeration.ref2;

public enum Grade {
    // 열거형
    // 리팩토링 2
    // 열거형을 사용한 리팩토링

    // 생성(문법)이 생략되어 있으므로 괄호()를 열고 생성자에 의해 인자로 들어가야 할 값을 넣어주면 된다.
    BASIC(10), GOLD(20), DIAMOND(30);
    // 밑에 로직이 추가되면, 세미콜론(;)을 통해 종료를 알려줘야 한다.

    private final int discountPercent;

    // enum 클래스에 의해 private이 생략되었다.
    //  - 상수는 기본적으로 외부에서 생성되지 못하므로, 굳이 private를 사용하지 않아도 된다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // discountPercent 필드를 추가하고, 생성자를 통해 필드에 값을 저장
    // 열거형은 상수로 지정하는 것 외에 일반적인 방법으로 생성이 불가하므로 생성자에 접근제어자를 선언할 수 없게 막혀 있다.
    //  - private이라고 생각하면 된다.
    // BASIC(10)과 같이 상수 마지막에 괄호를 열고 생성자에 맞는 인수를 전달하면 적절한 생성자가 호출된다.
    // 값을 조회하기 위해 getDiscountPercent() 메서드를 추가했다.
    //  - 열거형도 클래스이므로 메서드를 추가할 수 있다.
}
