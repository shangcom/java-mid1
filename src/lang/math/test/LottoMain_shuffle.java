package lang.math.test;


import java.util.Arrays;

public class LottoMain_shuffle {
    public static void main(String[] args) {

        LottoGenerator_shuffle generator = new LottoGenerator_shuffle();

        // 로또 번호 생성
        int[] lottoNumbers = generator.generate();

        // 생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        Arrays.sort(lottoNumbers); // 정렬 후 출력
        System.out.println(Arrays.toString(lottoNumbers));

    }
}
