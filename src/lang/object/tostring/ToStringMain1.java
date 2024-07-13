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

        // Object가 제공하는 toString() 메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조감(해시코드)를 16진수로 제공한다.
        // 해시코드에 대한 내용은 이후에 별도로 다루기에 지금은 객체의 참조값 정도로 생각하면 된다.
        // return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
