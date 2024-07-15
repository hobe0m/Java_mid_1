package lang.string.builder;

public class LoopStringMain {
    // String 최적화
    // 자바의 컴파일러는 문자열 리터럴을 더하는 부분을 자동으로 합쳐준다.
    // 따라서 런타임에 별도의 문자열 결합 연산을 수행하지 않기 때문에 성능이 향상된다.

    // 다만 문자열 변수의 경우 그 안에 어떤 값이 들어있는지 컴파일 시점에는 알 수 없기에 단순하게 합칠 수 없다.
    // 따라서 StringBuilder를 써서 최적화를 수행한다.
    // 자바 9부터는 StringConcatFactory를 사용해서 최적화를 수행한다.
    // 이 부분은 그냥 자바 내부에서 최적화를 해주는구나 하고 생각하면 된다.
    // 이렇듯 자바가 최적화를 처리해주기 때문에 간단한 경우에는 StringBuilder를 사용하지 않고, 더하기 연산(+)을 사용하면 충분하다.

    // String 최적화가 어려운 경우(안되는 경우)
    //  - 문자열을 루프 안에서 문자열과 더하는 경우
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 현재의 밀리 세컨드(1초의 1/1000) 시간을 구할 수 있음
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time : " + (endTime - startTime) + "ms"); 
        // 문자 10만번 더했을 때 5,184ms 소요
        // 왜 이렇게 오래 걸렸을까
        // result = new StringBuilder().append(result).append("Hello Java").toString(); 이 과정을 10만번 반복했기 때문이다.
        // 반복문 내에서 문자열 연결은, 런타임에 연결할 문자열의 개수와 내용이 결정되므로 컴파일러가 예측할 수 없어 최적화가 어렵다.
        // 따라서 직접 10만번의 String 객체를 생성했을 것이다.
    }
}
