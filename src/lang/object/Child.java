package lang.object;

public class Child extends Parent {
    // 명시적으로 Parent를 상속 받음
    // 따라서 Object를 자동으로 상속받지 않는다.
    public void childMethod() {
        System.out.println("Child.childMethod");
    }

    // 어쩄거나 모든 클래스의 최상위 부모는 Object 클래스이다.
}
