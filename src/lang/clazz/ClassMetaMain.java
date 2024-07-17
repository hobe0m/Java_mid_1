package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    // Class 클래스
    // 패키지 생성 시 예약어를 피하기 위해 s 대신 z 를 사용하여 clazz라고 한다.
    // 자바에서 Class 클래스는 클래스의 정보(메타데이터)를 다루는데 사용된다.
    // Class 클래스를 통해 개발자는 실행 중인 자바 애플리케이션 내에서 필요한 클래스의 속성과 메서드에 대한 정보를 조회하고 조작할 수 있다.

    // Class 클래스의 주요 기능은 다음과 같다.
    //  - 타입 정보 얻기: 클래스의 이름, 슈퍼클래스, 인터페이스, 접근 제한자 등과 같은 정보를 조회할 수 있다.
    //  - 리플렉션: 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고, 이들을 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 등의 작업을 할 수 있다.
    //  - 동적 로딩과 생성: Class.forName() 메서드를 사용하여 클래스를 동적으로 로드하고, newInstance()메서드를 통해 새로운 인스턴스를 생성할 수 있다.
    //  - 애노테이션 처리: 클래스에 적용된 애노테이션(annotation)을 조회하고 처리하는 기능을 제공한다

    // 예를 들어 String.class는 String 클래스에 대한 Class 객체를 나타내며, 이를 통해 String 클래스에 대한 메타데이터를 조회하거나 조작할 수 있다.
    public static void main(String[] args) throws ClassNotFoundException {
        // Class 조회(3가지 방법 존재), String이 불변 객체이기 때문에 인스턴스를 받아줘야 한다.
        // 타입.String : 우리가 만든 클래스에 대한 정보를 조회할(알아올 수) 있다.
        Class clazz = String.class; // 1. 클래스에서 조회
        Class clazz1 = new String().getClass(); // 2. 인스턴스에서 조회

        // Class.forName을 쓰기 위해서는 ClassNotFountException이라는 예외를 처리해줘야 한다.
        // 예외 처리에 대한 부분은 추후에 설명한다.
        // 이런 경우 Scanner로 값을 받아서 조회할 수도 있다.
        Class clazz2 = Class.forName("java.lang.String"); // 3. 문자열로 조회

        // 클래스가 가진 모든 필드 출력
        // import를 해야 사용 가능(java.lang.reflect.Field;)
        Field[] fields = clazz.getDeclaredFields(); // Declared : 선언된(명시된), 즉 클래스에 선언된 모든 필드들을 조회
        for (Field field : fields) {
            System.out.println("field : " + field.getType() + " " + field.getName());
        }
        
        // 클래스가 가진 모든 메서드 출력
        // import를 해야 사용 가능(java.lang.reflect.Method;)
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }

        // 클래스의 상위 클래스 정보 출력(부모가 없으면, 모든 객체의 부모인 Object 상속)
        System.out.println("SuperClass : " + clazz.getSuperclass().getName());

        // 클래스가 구현하는 인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("interface : " + i.getName());
        }

        // Class의 주요 기능
        //  - getDeclaredFieids() : 클래스의 모든 필드를 조회한다.
        //  - getDeclaredMethods() : 클래스의 모든 메서드를 조회한다.
        //  - getSuperClass() : 클래스의 부모 클래스를 조회한다.
        //  - getInterfaces() : 클래스의 인터페이스들을 조회한다.
    }
}
