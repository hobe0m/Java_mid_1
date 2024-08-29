package exception.ex2;

// 예외 처리 도입
// 앞서 만든 프로그램은 반환 값을 사용해 예외를 처리했는데, 그 결과 여러 문제가 존재했다.
//  - 정상 흐름과 예외 흐름이 섞여 있어 코드를 한눈에 이해하기 어렵고 따라서 정상 흐름이 한 눈에 들어오지 않는다.
//  - 심지어 예외 흐름이 더 많은 코드 분량을 차지한다.
//   - 참고로 실무에서는 예외 처리가 훨씬 더 복잡하다.

// NetworkClient에서 발생시키는 오류 생성, V2는 패키지와 맞춘 것
// Exception을 상속받아 체크 예외로 전환
public class NetworkClientExceptionV2 extends Exception {

    // 예외도 객체이므로 필요한 필드와 메서드를 가질 수 있다.
    private String errorCode;

    // 예외를 만들 때 에러 코드와 메세지를 넣는다.
    // 메세지는 부모의 기능을 빌려 사용
    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    // 오류 코드
    // 이전에는 오류 코드(errorCode)를 반환 값으로 리턴해서, 어떤 오류가 발생했는지 구분했다.
    // 여기서는 어떤 종류의 오류가 발생하는지 구분하기 위해 예외 안에 오류 코드를 보관한다.

    // 오류 메세지
    // 오류 메세지(message)에는 어떤 오류가 발생했는지 개발자고 보고 이해할 수 있는 설명을 담아둔다.
    // 오류 메세지는 상위 클래스은 Throwable에서 기본으로 제공하는 기능을 사용한다.
}
