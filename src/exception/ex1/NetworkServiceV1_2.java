package exception.ex1;

public class NetworkServiceV1_2 {
    // 예외 처리가 필요한 이유
    //  - 반환 값으로 예외 처리

    // 연결에 실패 시 데이터 전송을 하지 않도록 하고 오류 로그도 남겨보자
    
    // NetworkClientV1은 connectError, sendError와 같은 오류 코드를 문자열로 반환하고 있으므로 이 반환 값을 이용해 예외 상황을 처리해보자.

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);

        // client의 connect 메서드에서 문자열을 반환하므로 반환값을 받는다.
        String connectResult = client.connect();

        // ctrl + alt + shift + t : 다양한 리팩토링 작업을 쉽게 수행할 수 있게 해준다.
        // ctrl + alt + m : Extract Method로 선택한 코드 블럭을 메서드로 추출해준다.

        // 리팩토링 : 결과가 성공이 아니다를 오류이다로 바꿔주는게 낫다.
        // if (!connectResult.equals("success"))를 isError로 바꿔주는게 낫다.
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            // 오류 발생 시 메서드 실행 종료
            return;
        }

        // client의 send 메서드에서 문자열을 반환하므로 반환값을 받는다.
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            // 오류 발생 시 메서드 실행 종료
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }

    // 위의 코드로 로그를 남길 수 있게 되었고, 연결 실패 시에도 데이터 전송이 되는 문제를 해결했다.
    // NetworkService는 NetworkClient를 사용하는 전체 흐름을 관리한다.
    // 오류가 발생한 경우 오류 코드를 출력으로 남기고 이 후 프로그램이 더 이상 진행되지 않도록 return을 사용해서 중지한다.
    //  - 따라서 연결에 실패하면 데이터를 전송하는 문제가 해결된다.
}
