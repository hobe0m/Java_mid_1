package lang.wrapper;

public class MyIntegerNullMain0 {
    // 기본형과 Null
    // 기본형은 항상 값을 가져야 하므로 null을 가질 수 없다.
    // 그러나 때로는 데이터가 없음이라는 상태가 필요할 수도 있다.
    // 멤버 변수에서 초기화 하지 않으면 기본값으로 초기화된다.
    // 지역 변수에서 초기화 하지 않으면 출력(초기화 필수)할 수 없다.
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1

        // 이 때 -1이 있어서 -1을 출력한건지, 혹은 값이 없어서 -1을 출력한 건지 파악 불가
        // 따라서 값이 없다라는 것을 표현하고 싶을 때 래퍼 클래스 사용 즉, 객체화(Integer) 해서 사용
        System.out.println(findValue(intArr, 100)); // 100
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1; // target과 같은 값을 못찾으면 -1 반환
    }
}
