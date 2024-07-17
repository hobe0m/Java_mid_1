package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        // 등급에 문자열을 사용하는 지금의 방식에서 나타날 수 있는 문제
        //  - 타입 안정성 부족 : 문자열은 오타가 발생하기 쉽고, 유효하지 않은 값이 입력될 수 있다.
        //  - 데이터 일관성 부족 : 'GOLD', 'Gold', 'gold' 등 다양한 형식으로 입력될 수 있어 일관성이 떨어진다.

        // String 사용 시 타입 안정성 부족 문제
        //  - 값의 제한 부족
        //   - String으로 상태나 카테고리를 표현하면, 잘못된 문자열을 실수로 입력할 가능성이 있다.
        //  - 컴파일 시 오류 감지 불가
        //   - 이러한 잘못된 값은 컴파일 시에는 감지가 되지 않고, 런타임에서만 문제가 발견되므로 디버깅이 어려워 질 수 있다.

        // 문제의 해결을 위해서는 특정 범위(정확한 문자)로 값을 제한해야 하는데 String은 어떤 문자열이든 받을 수 있기에 String 타입을 사용해서는 문제를 해결할 수 없다.

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount("BASIC", price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND", price);

        // 존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
       
        // 오타
        int diamondd = discountService.discount("DIAMONDD", price);

        // 소문자 입력
        int gold1 = discountService.discount("gold", price);

        System.out.println("BASIC 등급의 할인 금액 : " + basic);
        System.out.println("GOLD 등급의 할인 금액 : " + gold);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);

        // 존재하지 않는 등급 출력
        System.out.println("VIP 등급의 할인 금액 : " + vip);
        
        // 오타 출력
        System.out.println("DIAMONDD 등급의 할인 금액 : " +  price);

        // 소문자 출력
        System.out.println("gold 등급의 할인 금액 : " + gold1);
    }
}
