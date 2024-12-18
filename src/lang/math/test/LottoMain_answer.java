package lang.math.test;


public class LottoMain_answer {
    public static void main(String[] args) {

        LottoGenerator_answer lottoGenerator = new LottoGenerator_answer();
        int[] lottoNumbers = lottoGenerator.generate();
        System.out.print("로또 번호: " );
        for (int lottoNumber : lottoNumbers) {
            System.out.print(lottoNumber + " ");
        }

    }
}
