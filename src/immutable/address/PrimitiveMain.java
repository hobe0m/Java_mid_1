package immutable.address;

public class PrimitiveMain {
    // 불변 객체(immutable : 불변성)
    // 자바가 제공하는 기본 클래스 중 대부분이 불변객체이고, 프로그래밍 언어에서도 매우 중요한 개념이다.

    // 기본형과 참조형의 공유
    // 자바의 데이터 타입을 가장 크게 보면 기본형(Primitive Type)과 참조형(Reference Type)으로 나눌 수 있다.
    //  - 기본형 : 하나의 값을 여러 변수에서 절대로 공유하지 않는다.
    //   - 값을 복사해서 대입
    //  - 참조형 : 하나의 객체를 참조값을 통해 여러 변수에서 공유할 수 있다.
    //   - 참조값을 복사해서 대입하기 때문에 같은 인스턴스를 바라볼 수 있다.

    // 여기서 하나의 값을 공유하거나 공유하지 않는다는 것이 무슨 뜻인지 확인할 필요가 있다.
    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유(복사 후 대입)하지 않는다.
        int a = 10;
        int b = a; // a -> b, 값 복사 후 대입 따라서 a도 b도 10
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b); // b는 20

        // 이처럼 기본형 변수 a와 b는 절대로 하나의 값을 공유하지 않는다.
        // b = a라고 하면 자바는 항상 값을 복사해서 대입힌다.
        // 결과적으로 a와 b는 둘 다 10이라는 똑같은 숫자의 값을 가진다.
        //  - 여기서 a가 가지는 10과 b가 가지는 10은 복사된 완전히 다른 10이며 메모리 상에서도 각각 존재한다.
    }
}
