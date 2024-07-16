package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

        // myInteger.compareTo()는 자기 자신의 값을 외부의 값과 비교
        // MyInteger는 객체이므로 자신이 가진 메서드를 편하게 호출할 수 있다.
        // 참고로 int는 기본형이므로 스스로 메서드를 가질 수 없다.
        // 또한 객체이므로 필요한 기능들을 만들어서 사용할 수 있다.

        int i1 = myInteger.compareTo(5); // 리턴 값을 데이터 타입에 맞게 받아줘야 쓸 수 있다.
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
