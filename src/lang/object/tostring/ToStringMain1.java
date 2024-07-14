package lang.object.tostring;

import lang.object.ObjectMain;

public class ToStringMain1 {
    // toString()
    // Object.toString() 메서드는 객체의 정보를 문자열 형태로 제공
    // 이는 디버깅과 로깅에 유용하게 사용된다.
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // toString의 반환값을 출력
        System.out.println(string);

        // object를 직접 출력
        System.out.println(object);

        // string과 object의 출력값이 똑같은 이유
        //  - println()의 내부에 object.toString이 있기 때문이다.
        // println에는 String도 Object도 전달할 수 있다.
        // 즉, 두 코드가 거의 같은 코드라고 보면 된다.

        // Object가 제공하는 toString() 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조감(해시코드)를 16진수로 제공한다.
        // 해시코드에 대한 내용은 이후에 별도로 다루기에 지금은 객체의 참조값 정도로 생각하면 된다.

        // Object 클래스의 toString()
        // public String toString() {
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
        // }

        // println()과 toString()
        //  - System.out.println()은 사실 내부에 object.toString()이 존재한다.
        //  - 즉, Object 클래스의 toString 메서드와 연결해주는 것이다.

        // toString의 오버라이딩
        // Object.toString() 메서드가 클래스 정ㅂ와 참조값을 제공하지만 이 정보만으로는 객체의 상태를 적절히 나타내지 못한다.
        // 그래서 보통 toString()을 재정의(오버라이딩)해서 보다 유용한 정보를 제공하는 것이 일반적이다.
    }
}
