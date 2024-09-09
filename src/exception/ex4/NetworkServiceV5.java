package exception.ex4;

public class NetworkServiceV5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        
        // try with resources 사용 예시
        // client 변수는 try문의 안에서만 쓸 수 있다.
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            // initError가 try문 안으로 내려와야 한다.
            client.initError(data); // 추가
            client.connect();
            client.send(data);

            // finally를 지우고 catch를 통해 예외를 확인한다.
            // try가 끝나면 AutoCloseable.close()가 자동 실행된다.
            // 따라서 서버 연결 해제가, 예외 확인보다 먼저 실행된다.
            //  - 즉, catch의 코드보다 close()가 우선시 되는 것이다.
            //  - finally보다 더 빠르다는 장점이 있다.
        } catch (Exception e) {
            System.out.println("[예약 확인] : " + e.getMessage());
            throw e;
        }
    }

    // Try with resources 구문은 try 안에 사용할 자원을 명시한다.
    // 이 자원은 try 블럭이 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제한다.
    // 참고로 여기서 catch 블럭 없이 try 블럭만 있어도 close()는 호출된다.
    // 여기서 catch 블럭은 단순히 발생한 에외를 잡아서 예외 메세지를 출력하고, 잡은 예외를 throw를 사용해서 다시 밖으로 던진다.

    // try with resources의 장점
    // 리소스 누수 방지
    //  - 모든 리소스가 제대로 닫히도록 보장한다.
    //  - 실수로 finally를 적지 않거나, finally 블럭 안에서 자원 해제 코드를 누락하는 문제를 해결할 수 있다.

    // 코드 간결성 및 가독성 향상
    //  - 명시적인 close() 호출이 필요 없어 코드가 더 간결하고 읽기 쉬워진다.

    // 스코프 범위 한정
    //  - 예를 들어 리소스로 사용되는 client 변수의 스코프가 try 블럭 안으로 한정된다.
    //  - 따라서 코드 유지보수가 더 쉬워진다.

    // 조금 더 빠른 자원 해제
    //  - 기존에는 try -> catch -> finally로 catch 이후에 자원을 반납했지만, try with resources 구문은 try 블럭이 끝나면 즉시 close()를 호출한다.
    
    // 정리
    // 문제와 풀이
    //  - 예외 처리 강의는 하나의 예제가 큰 흐름으로 이어지므로 예제를 처음부터 복습하면서 큰 흐름을 스스로 정리해보자.

    // 처음 자바를 설계할 당시에는 체크 예외가 더 나은 선택이라 생각해 자바가 기본으로 제공하는 기능들에는 체크 예외가 많다.
    // 그런데 시간이 흐르면서 복구할 수 없는 예외들이 너무 많아지고, 특히 라이브러리를 점점 더 많이 사용하면서 처리해야 하는 예외도 더 늘어났다.
    // 라이브러리들이 제공하는 체크 예외를 처리할 수 없을 때마다 throws 예외를 덕지덕지 붙여야 했기에 개발자들은 극단적으로 throws Exception이라는 방법도 사용하고 되었다.
    // 물론 저 방법은 사용하면 안되는데 그 이유는 앞서 설명했듯 잡을 예외와 던져질 예외를 알 수 없게 되기 때문이다.
    // 체크 예외를 사용한다면 잡을 건 잡고 던질 예외는 명확하게 던지도록 선언해야 한다.
    // 체크 예외의 이러한 문제점 때문에 최근 라이브러리들은 대부분 런타임 예외를 기본으로 제공하고 가장 유명한 스프링이나 JPA 같은 기술들도 대부분 언체크(런타임) 예외를 사용한다.
    // 런타임 예외도 필요하면 잡을 수 있기 때문에 필요한 경우에는 잡아서 처리하고, 그렇지 않으면 자연스럽게 던지도록 둔다.
    // 그리고 처리할 수 없는 예외는 예외를 공통으로 처리하는 부분을 만들어서 해결하면 된다.
}
