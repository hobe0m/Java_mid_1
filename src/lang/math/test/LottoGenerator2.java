package lang.math.test;

import java.util.Random;

public class LottoGenerator2 {
    // 로또 2, 보너스 번호까지 출력

    // 로또 번호 뽑는 기계 생성
    private final Random random = new Random();
    
    // 로또 번호 적을 종이 생성
    private int[] lottoNumbers;
    
    // 몇 개의 공을 뽑았는 지 세는 카운트 생성
    int count;
    
    // 기계가 작동하는 메서드
    // 기계가 작동하고 나면 1 ~ 45까지의 번호 중 중복되지 않는 7개의 번호가 나와야 하므로 int[]로 반환 타입 선언
    public int[] generate() {
        // 종이의 칸 수 지정(7칸)
        lottoNumbers = new int[7];
        
        // 뽑기 전이므로 0, 뽑으면 값을 대입
        count = 0;
        
        // 뽑은 횟수가 7보다 작을 때까지, 현재 0이므로 0~6 총 7번
        while (count < 7) {
            // 1 ~ 45까지의 번호 중 하나를 뽑는다.
            int number = random.nextInt(45) + 1;
            
            // 뽑은 번호가 중복이 아니라면 종이에 적는다.
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        // 다 뽑았으면, 뽑은 종이 반환
        return lottoNumbers;
    }
    
    // 뽑은 번호가 중복인 지 확인하는 메서드
    private boolean isUnique(int number) {
        // 뽑힐 때마다 반복
        for (int i = 0; i < count; i++) {
            // 이때까지 뽑았던 공들과 비교
            if (lottoNumbers[count] == number) {
                // 중복이면 적지 않는다.
                return false;
            }
        }
        return true;
    }
}
