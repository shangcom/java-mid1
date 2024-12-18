package lang.math.test;


import java.util.Random;

public class LottoGenerator_shuffle {
    private final int[] pot = new int[45];
    private final Random random = new Random();

    public LottoGenerator_shuffle() {
        // 1부터 45까지 배열 초기화
        for (int i = 0; i < pot.length; i++) {
            pot[i] = i + 1;
        }
    }

    public int[] generate() {
        for (int i = pot.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = pot[i];
            pot[i] = pot[j];
            pot[j] = temp;
        }

        // 첫 6개 번호 반환
        int[] lottoNumbers = new int[6];
        System.arraycopy(pot, 0, lottoNumbers, 0, 6);
        return lottoNumbers;
    }

}
