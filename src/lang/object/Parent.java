package lang.object;

public class Parent {
    // Object 클래스
    // 자바에서 모든 클래스의 최상위 부모 클래스는 항상 Object 클래스이다.
    // 만약 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속받는다.
    //  - 즉, extends Object(최상위 부모)가 생략되어 있는 것(따라서 명시적으로 상속받는 것은 생략하기를 권장)
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
