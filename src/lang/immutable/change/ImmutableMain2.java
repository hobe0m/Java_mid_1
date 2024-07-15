package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj Obj1 = new ImmutableObj(10);
        Obj1.add(20);

        // 리턴 값을 받아서 사용하지 않았으므로 기존 값은 유지되고 새로운 값은 버려진다.
        // 따라서 add의 결과를 새로운 객체로 받아 출력해야 한다.
        System.out.println("obj1 : " + Obj1.getValue());
    }
}
