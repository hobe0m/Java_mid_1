package enumeration.ref1;

public class ClassGrade {
    // 3. 생성 시 할인율이 자동 지정되게끔 할인율을 인자에 넣어둔다.
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    // 1. 등급이 할인율을 관리할 수 있도록 하기 위해 ClassGrade에 discountPercent 추가
    private final int discountPercent;

    // 2. 생성자를 만들고, 생성 시 discountPercent를 인자로 받아 등급에 맞는 할인율이 부여되게끔 설정
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 할인율 필드 추가, 조회 메서드 추가
    // 생성자를 통해서만 할인율이 생성되게끔 설정, 중간에 값이 변경되지 않게끔 불변으로 설계
    // 따라서 상수를 정의할 때 각각의 등급에 맞는 할인율이 정해진다.
}
