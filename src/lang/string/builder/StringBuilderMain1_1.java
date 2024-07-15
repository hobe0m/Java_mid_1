package lang.string.builder;

public class StringBuilderMain1_1 {
    // StringBuilder
    // 가변 String

    // 불변인 String의 단점
    //  - 문자를 더하거나 변경할 때마다 새로운 객체를 생성해야 한다는 점
    // 예를 들어 String str = "A" + "B" + "C" + "D"; 라고 할 때
    // "AB" + "C" +"D", "ABC" + "D"를 거치기 때문에 객체가 3개나 만들어지고, 게다가 마지막에 생성된 객체만 사용된다.
    // 만약 문자를 자주 더하거나 변경해야 하는 상황이라면 더 많은 String 객체를 만들고, GC해야 한다.
    // 결과적으로 컴퓨터의 CPU, 메모리를 자원을 더 많이 사용하게 된다.
    // 그리고 문자열의 크기가 클수록, 문자열을 더 자주 변경할수록 시스템의 자원을 더 많이 소모한다.

    // 참고
    // 실제로는 문자열을 다룰 때 자바가 내부에서 최적화를 적용하는데, 이는 뒤에서 다룬다.

    // 이 문제를 해결하는 방법은 바로 불변이 아닌 가변 String이 존재하면 된다.
    // 가변은 내부의 값을 바로 변경하면 되기 때문에 새로운 객체를 생성할 필요가 없고 따라서 성능과 메모리 사용면에서 더 효율적이다.
    // 따라서 자바는 StringBuilder라는 가변 String을 제공한다.
    //  - 물론 이 경우 사이드 이펙트에 주의해서 사용해야 한다.

    // StringBuilder는 가변 byte[]을 가진다.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // append는 뒤에다 계속 더하는 메서드이다.
        // sb.append("A")는 sb + "A"와 같다.
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        // 띄어쓰기가 있으므로 D뒤에 Java를 붙인다.
        // insert는 말 그대로 삽입, 인덱스 위치와 문자열을 적어주면 된다.
        sb.insert(4, "Java");
        System.out.println("insert : " + sb);

        // delete는 없앨 인덱스의 시작점과 끝점을 알려주면 그 사이에 문자열을 삭제해준다.
        sb.delete(4, 8);
        System.out.println("delete : " + sb);

        // reverse는 문자열을 거꾸로 뒤집어 준다.
        // StringBuilder는 가변이기에 메서드를 쓰고 바로 출력하면 된다.
        //  - 객체에 담을 필요가 없다.
        sb.reverse();
        System.out.println("reverse : " + sb);

        // StringBuilder -> String
        // toString() 사용
        // 가변을 다시 불변으로 바꾸는 방법
        String string = sb.toString();
        System.out.println("string : " + string);

        // 가변으로 쭉 사용하다가 원하는 문자열이 되면 불변으로 바꿀 수 있다.

        // 가변(Mutable) vs 불변(Immutable)
        // String은 불변하므로 한번 생성되면 그 내용을 변경할 수 없다.
        // 따라서 문자열에 변화를 주려고 할 때마다 새로운 객체가 생성되고 기존 객체는 버려지므로 메모리와 처리 시간을 더 많이 소모한다.
        // 반면 StringBuilder는 가변적으므로 하나의 객체 안에서 문자열을 추가, 삭제, 수정할 수 있으며 이 때마다 새로운 객체를 생성하지 않아 메모리 사용을 줄이고 성능을 향상 시킬 수 있다.
        //  - 단 사이드 이펙트를 주의해야 한다.

        // 따라서 StringBuilder는 문자열을 변경하는 동안만 사용하다가 변경이 끝나면 안전한(불변) String으로 변환하는 것이 좋다.
    }
}
