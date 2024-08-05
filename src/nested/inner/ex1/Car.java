package nested.inner.ex1;

public class Car {
    // 모델명
    private String model;

    // 충전 레벨
    private int chargeLevel;

    // 엔진
    // 자신의 엔진을 생성하고, 엔징을 사용해 자동차의 기능을 수행할 수 있게끔 하기 위해 존재
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        // Engine 생성 시 Car 인스턴스가 필요하므로 this를 매개 변수로 넣는다.
        // 따라서 매개변수의 this와 this.engine의 this는 같은 Car 인스턴스를 가리킨다.
        this.engine = new Engine(this);
    }

    // Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    // Car 클래스는 엔진에 필요한 메서드들을 제공해야 하고, 제공된 메서드는 엔진에서만 사용되고 다른 곳에서는 사용되지 않는다.
    // 결과적으로 Car 클래스는 엔진에서만 사용하는 기능을 위해 메서드를 추가해서 모델 이름과 충전 레벨을 외부에 노출해야 한다.
}
