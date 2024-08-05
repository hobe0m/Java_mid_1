package nested.inner.ex1;

// Car에서만 사용하는 클래스
public class Engine {
    // 내부 클래스의 활용
    // 내부 클래스로 리팩토링 전

    // Car의 참조값을 받는 것
    // Engine 클래스가 Car 인스턴스의 정보(필드, 메서드)를 사용할 수 있게 하기 위해 사용한다.
    private Car car;

    // 엔진 생성 시 Car의 인스턴스를 매개 변수로 받아 Engine에서 사용하는 Car의 인스턴스로 저장
    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인 : " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
