package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        // 자기 자신의 참조값을 반환하기 때문에 참조값에 .(점)을 찍고 메서드를 이어 사용하는 것
        // adder.add(1)은 값을 더하고 참조값 반환하므로 x001.add(2).add(3).getValue();가 된다.
        // 이런 식으로 계속해서 자기 자신의 참조값을 반환하므로 .(점)만 사용해서 메서드를 이어 붙일 수 있는 것이다.
        // 체인처럼 메서드가 연결되어 있어서 메서드 체이닝이라고 한다.

        // 반환된 참조값을 변수에 담아두지 않고 즉시 사용해서 메서드를 호출하는 것이다.
        // 마지막에 사용한 메서드의 반환값에 맞는 타입으로 받아줘야 한다.

        System.out.println("result : " + result);

        // 메서드 체이닝 기법은 코드를 간결하게 하고 읽기 쉽게 만들어준다.
    }
}
