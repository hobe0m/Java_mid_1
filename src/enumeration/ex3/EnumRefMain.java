package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC : " + Grade.BASIC.getClass());
        System.out.println("class GOLD : " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND : " + Grade.DIAMOND.getClass());
        // 모두 Grade 타입임을 확인

        // Enum은 toString을 상수의 값으로 오버라이딩해서 참조값이 아닌 해당 상수의 값이 나온다.
        System.out.println("ref BASIC : " + retValue(Grade.BASIC));
        System.out.println("ref GOLD : " + retValue(Grade.GOLD));
        System.out.println("ref DIAMOND : " + retValue(Grade.DIAMOND));
        // 3가지의 참조값이 모두 다른 것을 확인
    }

    // 따라서 참조값을 확인하기 위해 Integer의 toHexString 메서드 사용
    // System.identityHashCode(grade)를 사용해서 객체의 해시코드 반환(해시코드는 정수)
    // Integer.toHexString()를 사용해서 정수값을 16진수 문자열로 변환
    private static String retValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
        // grade의 해시코드를 System.identityHashCode로 파악
        //  - 정수 출력(해시코드가 정수)
        //  - 자바가 관리하는 객체의 참조값을 숫자로 반환하는 것

        // 출력된 해시코드를 Integer.toHexString(정수를 16진수 문자열로 변환)을 사용하여 16진수 문자열로 변환
        // 우리가 일반적으로 확인하는 참조값이 16진수이기 때문에 16진수로 변경
    }
}
