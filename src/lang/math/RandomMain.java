package lang.math;

import java.util.Random;

// shift + F6 : 전체 이름 리팩토링(클래스에 커서를 두고 누르면 모든 패키지 내에 있는 클래스 이름이 변경)
public class RandomMain {
    // Random 클래스
    // 랜덤의 경우 Math.random()을 사용해도 되지만 Random 클래스를 사용하면 더욱 다양한 랜덤값을 구할 수 있다.
    // 참고로 Math.random()도 내부에서는 Random 클래스를 사용한다.

    // 참고로 Random 클래스는 java.util 패키지 소속이다.
    //  - System 클래스가 아니다.
    public static void main(String[] args) {
        Random random = new Random();
        // Random random = new Random(1); Seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt(); // 0.0(int) ~ 1.0(int)
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0(double) ~ 1.0(double)
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); // 10이라는 범위 지정, 따라서 0 ~ 9까지 출력
        System.out.println("0 ~ 9 : " + randomRange1);

        // 많이 쓰는 방법
        // 보통 범위(10)까지 포함하고, 0은 제외한 상태로 랜덤으로 출력하기 때문에 +1을 해준다.
        //  - 원래 범위는 포함되지 않고 0은 포함되기 때문이다.
        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10까지 출력
        System.out.println("1 ~ 10 : " + randomRange2);

        // Random의 주요 메서드
        // random.nextInt() : 0.0 ~ 1.0 사이의 랜덤 int 값을 반환
        // nextDouble() : 0.0d ~ 1.0d 사이의 랜덤 double 값을 반환
        // nextBoolean() : 랜덤 boolean 값을 반환
        // nextInt(int bound) : 0 ~ bound 미만의 숫자를 랜덤으로 반환한다. 예를 들어서 3을 입력하면 0, 1, 2 를 반환
        //  - 1부터 특정 숫자의 int 범위를 구하는 경우 nextInt(int bound)의 결과에 +1을 하면 된다.

        // Seed(씨드)
        // 랜덤은 내부에서 씨드(Seed)값을 사용해서 랜덤 값을 구한다.
        // 이 때, 이 씨드 값이 같으면 항상 같은 결과가 출력된다.
        // Random random = new Random(); -> 랜덤 값 반환
        // Random random = new Random(1); -> 씨드가 고정되어 동일한 값 반환

        // new random()처럼 생성자를 비워두면 내부에서 System.nanoTime()에 여러가지 복잡한 알고리즘을 섞어서 씨드값을 생성한다.
        //  - 따라서 반복 실행해도 결과가 항상 달라진다.

        // new random(1)
        // 그러나 이렇게 생성자에 씨드값을 직접 전달하면, 여러 번 반복해도 실행 결과가 매번 같다.
    }
}
