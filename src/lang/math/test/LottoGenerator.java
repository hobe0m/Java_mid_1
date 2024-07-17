package lang.math.test;


import java.util.Random;

public class LottoGenerator {

    // random.nextInt의 값을 뽑을 떄 중복이 없게 하기 위해 final로 선언
    private final Random random = new Random();

    // 뽑은 로또 번호가 들어갈 배열
    private int[] lottoNumbers;

    // 공을 뽑는 횟수
    private int count;

    // 번호 생성 메서드, 생성한 번호이 6개이므로 배열로 받는다.
    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않는 경우만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
