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
}
