package nested.inner.ex1;

// Car에서만 사용하는 클래스
public class Engine {
    // 내부 클래스의 활용
    // 내부 클래스로 리팩토링 전

    // Car의 참조값을 받는 것
    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인 : " + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
