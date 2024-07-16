package lang.wrapper;

public class WrapperClassMain {
    // 래퍼 클래스
    // 자바의 래퍼 클래스
    // 래퍼 클래스는 쉽게 이야기 해서 기본형의 객체 버전이다.

    // 자바는 기본형에 대응하는 래퍼 클래스를 기본으로 제공한다.
    // byte -> Byte
    // short -> Short
    // int -> Integer
    // long -> Long
    // float -> Float
    // double -> Double
    // char -> Character
    // boolean -> Boolean

    // char(Character)와 int(Integer)를 제외하고 나머지 기본형은 첫 글자를 대문자로 바꾸기만 하면 된다.

    // 자바가 제공하는 이러한 기본 래퍼 클래스는 두 가지 특징을 가진다.
    //  - 불변이다.
    //  - equals로 비교해야 한다.
    public static void main(String[] args) {
        // toString()을 오버라이딩 하고 있기 때문에 객체의 참조값이 아닌 10으로 출력이 된다.
        Integer newInteger = new Integer(10); // 오류(컴파일러 경고 X, Deprecated 경고, 미래에 삭제 예정) 뜨는 것 무시하면 된다.
        System.out.println("newInteger = " + newInteger);

        // Integer가 아닌 valueOf를 사용하면 된다.
        // 이 때, 불변 객체이기 때문에 객체에 담아서 반환 후 출력해야 한다.
        // Integer.valueOf()는 -128 ~ 127 즉, 자주 사용하는 숫자 값 재사용, 불변
        // 따라서 Integer.valueOf(10)을 두 변수에 담으면 동일성(== 비교)도 충족한다.
        Integer integerObj = Integer.valueOf(10);
        System.out.println("integerObj = " + integerObj);

        Long longObj = Long.valueOf(100);
        System.out.println("longObj = " + longObj);

        Double doubleObj = Double.valueOf(10.5);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        System.out.println("비교");
        // 다른 참조를 보고 있기 때문에 false가 나온다.
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + (newInteger.equals(integerObj)));
    }

    // 래퍼 클래스 생성
    // 박싱(Boxing)
    // 기본형을 래퍼 클래스로 변경하는 것은 마치 박스에 물건을 넣은 것 같다고 해서 박싱(Boxing)이라 한다.
    // new Integer(10)은 향후 자바에서 삭제될 예정이므로 사용하지 말고, Integer.valueOf(10)을 사용하자
    // Integer.valueOf(10)는 -128 ~ 127의 클래스(문자열 풀과 비슷)를 미리 생성해주므로 성능과 최적화의 측면에서 이점이 있다.
    //  - 이 또한 내부에서 new Integer(10)을 사용해서 객체를 생성해서 돌려주는 것이다.

    // 래퍼 클래스 풀기(해제)
    // intValue(), 언박싱(UnBoxing)
    // 포장되어 있는 박스를 풀어서 실제 기본값을 꺼내는 것 같다고 해서 언박싱이라고 한다.
    // doubleValue(), longValue() 등 다양하게 존재

    // 래퍼 클래스는 객체이기 때문에 동일성(==) 비교를 하면 인스턴스의 참조값을 비교해서 false가 나온다.
    // 내부의 값을 비교하도록 래퍼 클래스 내에 eqauls()를 재정의해두었으므로 값을 비교하려면 eqauls 클래스를 사용하면 된다.
    // 참고로 래퍼 클래스는 객체를 그대로 출력해도 내부에 있는 값을 문자로 출력하도록 toString()을 재정의 해두었다.
}
