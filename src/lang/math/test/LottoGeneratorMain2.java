package lang.math.test;

public class LottoGeneratorMain2 {
    public static void main(String[] args) {
        // 로또 2, 보너스 번호까지 출력

        // 기계 생성
        LottoGenerator2 generator = new LottoGenerator2();

        // 기계의 동작이 끝나면 종이가 출력되므로 종이 형태로 받아줘야 한다.
        int[] lottoNumbers = generator.generate();
        System.out.print("로또 번호 : ");
        for (int i = 0; i < 7; i++) {
            if (i < 6) {
                System.out.print(lottoNumbers[i] + " ");
            } else {
                System.out.println();
                System.out.print("보너스 번호 : ");
                System.out.print(lottoNumbers[6]);
            }
        }
    }
}
