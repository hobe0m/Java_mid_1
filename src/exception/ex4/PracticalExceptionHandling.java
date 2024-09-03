package exception.ex4;

public class PracticalExceptionHandling {
    // 실무에서의 예외 처리 방법

    // 처리할 수 없는 예외
    // 예를 들어, 상대 네트워크 서버에 문제가 발생해서 통신이 불가능하거나, 데이터베이스 서버에 문제가 발생해서 접속이 안되면 애플리케이션에서 연결 오류, 데이터베이스 접속 실패와 같은 예외가 발생한다.
    // 이렇게 시스템 오류 때문에 발생한 예외들은 대부분 예외를 잡아도 해결할 수 있는 것이 거의 없다.
    //  - 예외를 잡아서 다시 호출을 시도해도 같은 오류가 반복될 뿐이다.
    // 이런 경우 고객에게는 "현재 시스템에 문제가 있습니다."라는 오류 메세지를 보여주고, 만약 웹이라면 오류 페이지를 보여주면 된다.
    // 그리고 내부 개발자가 문제 상황을 빠르게 인지할 수 있도록, 오류에 대한 로그를 남겨두어야 한다.

    // 체크 예외의 부담
    // 체크 예외는 개발자가 실수로 놓칠 수 있는 예외들을 컴파일러가 체크해주기 때문에 오래전부터 많이 사용되었다.
    // 그런데 앞서 설명한 것처럼 처리할 수 없는 예외가 많아지고, 또 프로그램이 점점 복잡해지면서 체크 예외를 사용하는 것이 점점 더 부담스러워졌다.

    // 체크 예외 사용 시나리오
    // 체크 예외를 사용하게 되면 어떤 문제가 발생하는지 알아보자.
}
