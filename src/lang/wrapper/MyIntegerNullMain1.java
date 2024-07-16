package lang.wrapper;

public class MyIntegerNullMain1 {
   
    // 래퍼 클래스 사용
    public static void main(String[] args) {

        // MyInteger 객체의 배열 생성 후, 값을 -1, 0, 1로 가지는 인스턴스 3개 배열에 넣기
        MyInteger[] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1

    
        System.out.println(findValue(intArr, 100)); // 100
    }

    // MyInteger를 반환 타입으로 받는 findValue() 메서드 생성
    // 인자로 MyInteger 객체의 배열인 intArr과 타겟이 될 숫자를 받는다.
    // 객체의 배열을 돌면서 각 객체의 value 중 target과 같은 숫자를 가지고 있는 게 있으면 해당 객체를 반환하고 없으면 null을 반환한다.
    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null;
        // null 값을 반환하는 경우 잘못하면 NullPointerException이 발생할 수 있기에 주의해서 사용해야 한다.
    }
}
