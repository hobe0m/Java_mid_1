package enumeration.ex2;

public class ClassGrade {
    // 타입을 상수만 있는 객체의 타입으로 지정해서 제한한다.

    // 회원 등급을 다루는 클래스 생성
    // 회원의 등급별로 상수 선언
    // 상수로 선언하기 위해 static, final 선언
    //  - static을 사용해 상수를 메서드 영역에 선언
    //  - final을 사용해 인스턴스(참조값) 변경 불가
    // 이 때 각각의 상수마다 별도의 인스턴스를 생성하고, 생성한 인스턴스를 대입
    
    // 객체의 타입은 현재 클래스와 이름이 동일

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가
    // 외부에서 직접 객체를 추가하지 못하게 막는다.
    private ClassGrade() {}
}
