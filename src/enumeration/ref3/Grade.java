package enumeration.ref3;

public enum Grade {
    // 열거형
    // 리팩토링 3
    
    // 리팩토링을 하고 나니 아래의 ref2의 DiscountService 같이 단순한 할인율 계산만 남게 된다
    // public int discount(Grade grade, int price) {
    //      return price * grade.getDiscountPercent() / 100;
    // }
    
    // 이 코드를 보면 할인율 계산을 위해 Grade가 가지고 있는 데이터인 discountPercent의 값을 꺼내서 사용한다.
    // 결국 Grade의 데이터인 discountPercent를 할인율 계산에 사용하는 것이다.
    // 객체 지향 관점에서 이렇게 자신의 데이터를 외부에 노출하는 것은 지양되므로 Grade 클래스가 자신의 할인율을 어떻게 계산하는지 스스로 관리하는 것이 캡슐화 원칙에 더 맞다.
    
    // Grade 클래스 안으로 discount() 메서드를 이동시키자

    BASIC(10), GOLD(20), DIAMOND(30);
    
    private final int discountPercent;

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
    
    // 할인율 계산 메서드 추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }


}
