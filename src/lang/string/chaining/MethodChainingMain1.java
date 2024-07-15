package lang.string.chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int result = adder.getValue();
        System.out.println("result : " + result);

        // add() 메서드를 여러번 호출해서 값을 누적해서 더하고 출력한다.
        // 여기서는 add() 메서드의 반환값은 사용하지 않았다.
    }
}
