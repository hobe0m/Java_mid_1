package lang.immutable.change;

public class ImmutableMain1 {
    public static void main(String[] args) {
        ImmutableObj Obj1 = new ImmutableObj(10);
        ImmutableObj Obj2 = Obj1.add(20);

        // 계산 이후에도 기존 값과 신규 값을 모두 확인할 수 있다.
        System.out.println("obj1 : " + Obj1.getValue());
        System.out.println("obj2 : " + Obj2.getValue());

        // 불변 객체를 설계할 때 기존 값을 변경해야 하는 메서드가 필요할 수 있다.
        // 이 때는 기존의 객체 값을 그대로 두고 변경된 결과를 새로운 객체에 담아 반환하면 된다.
    }
}
