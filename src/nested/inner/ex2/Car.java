package nested.inner.ex2;

public class Car {
    // 내부 클래스로 리팩토링
    // 엔진은 차의 내부에서만 사용되어야 하고, 엔진은 차의 충전 레벨과 모델명에 접근 가능해야 한다.

    private String model;

    // 충전 레벨
    private int chargeLevel;

    // 엔진
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

     private class Engine {
        // 바깥 클래스에 접근할 수 있으므로 new Car(), car.은 다 없애줘도 된다.

        // getChargeLevel(), getModel() 등의 메서드를 없애도 된다.
        // 직접 접근하면 되기 때문이다.
        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }

    // 엔진을 내부 클래스로 만들었다.
    // 따라서 기존의 Engine.start()와는 달리 chargeLevel와 model에 직접 접근할 수 있게 되었다.

    // 내부 클래스의 생성
    // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때는 바깥 클래스 이름을 생략할 수 있다.
    //  - 그냥 new Engine()을 사용하면 된다.
    // 바깥 클래스에서 내부 클래스의 인스턴스를 생성할 때 내부 클래스의 인스턴스는 자신을 생성한 바깥 클래스의 인스턴스를 자동으로 참조한다.
    // 여기서 new Engine()으로 생성된 Engine 인스턴스는 자신을 생성한 바깥의 Car 인스턴스를 자동으로 참조한다.

    // 리팩토링 전의 문제
    // Car 클래스에서는 엔진에 필요한 메서드를 제공했어야 하는데 제공하는 메서드는 엔진에서만 사용되는 메서드였다.
    // 따라서 엔진에서만 사용하는 기능을 위해 메서드를 추가하고, 모델 이름과 충전 레벨을 외부에 노출시켜야 한다는 문제가 있었다.
    // 이는 불필요한 정보들이 외부에 노출되는 것으로 캡슐화를 방해한다.
    
    // 리팩토링 후에는 getModel(), getChargeLevel()과 같은 메서드를 제거해 결과적으로 꼭 필요한 메서드만 외부에 노출함으로써 Car의 캡슐화를 더 높일 수 있었다.
    
    // 중첩 클래스의 사용 시기
    //  - 중첩 클래스는 특정 클래스가 다른 하나의 클래스 안에서만 사용되거나, 둘이 아주 긴밀하게 연결되어 있는 특별한 경우에만 사용해야 한다.
    //  - 외부 여러 곳에서 특정 클래스를 사용한다면 중첩 클래스로 사용하면 안된다.

    // 중첩 클래스를 사용하는 이유
    // 논리적 그룹화
    //  - 특정 클래스가 다른 하나의 클래스 안에서만 사용되는 경우 해당 클래스 안에 포함하는 것이 논리적으로 더 그룹화가 된다.
    //  - 패키지를 열었을 때 다른 곳에서 사용될 필요가 없는 중첩 클래스가 외부에 노출되지 않는 장점도 있다.
    // 캡슐화
    //  - 중첩 클래스는 바깥 클래스의 private 멤버에 접근할 수 있어 둘을 긴밀하게 연결하고 불필요한 public 메서드를 제거할 수 있다.
}
