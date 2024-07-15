package string.equals;

public class StringEqualsMain1 {
    // String 클래스
    // 비교
    // String 클래스를 비교할 때는 == 비교가 아니라 항상 equals() 비교를 해야한다.
    //  - 동일성(Identity) : == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
    //  - 동등성(Equality) : equals() 메서드를 사용하여 두 객체가 논리적으로 같은 지 확인

    // 객체를 생성한 경우에는 동일성 비교는 실패, 동등성 비교는 성공한다.
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new Strung() equals() 비교 : " + (str1.equals(str2))); // value 즉 String()의 문자열 값으로 비교


        // 리터럴로 사용했을 때, 동일성과 동등성이 둘 다 true가 나오는 이유
        // 문자열 리터럴을 사용하는 경우 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용한다.
        // 자바가 클래스 정보를 읽을 때(로딩) 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어두고, 같은 문자열이 있다면 만들지 않는다.
        // 따라서 실행되는 시점에는 문자열 풀에서 hello라는 문자열을 찾아서 사용하기 때문에 str3와 str4는 같은 인스턴스를 참조한다고 할 수 있다.
        // 쉽게 말해 처음 나오는 문자열을 문자열 풀에 넣고, 그걸 가져다가 쓰기 때문에 객체(static final, 하나의 참조값)를 하나 만들고 그걸 가져다가 쓴다고 생각하면 된다.
        // 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 시간도 줄어들기 때문에 성능도 최적화 할 수 있다.
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals() 비교 : " + (str3.equals(str4)));

        // 참고
        // Pool : 자원이 모여있는 곳
        // 프로그래밍에서는 공용 자원을 모아두는 곳을 의미한다.
        // 여러 곳에서 함께 사용할 수 있는 객체를 필요할 때마다 생성하고 제거하는 것은 비효율적이기에 풀에 필요한 인스턴스(객체)를 미리 만들어두고 여러 곳에서 재사용한다.
        // 그렇게 하면 성능과 메모리 측면에서 효율적이다.
        // 참고로 문자열 풀은 힙 영역을 사용하고 문자열 풀에서 문자를 찾을 때는 해시 알고리즘을 사용하기에 매우 빠른 속도로 원하는 String 인스턴스를 찾을 수 있다.
        //  - 속도를 걱정할 필요 없음
        //  - 해시 알고리즘은 뒤에서 설명한다.
    }
}
