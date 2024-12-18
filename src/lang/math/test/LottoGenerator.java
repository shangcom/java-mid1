package lang.math.test;


import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] pot = new int[45];
    private int[] winningPot = new int[6];

    public void generate() {
        for (int i = 0; i < pot.length; i++) {
            pot[i] = i + 1;
        }

        for (int i = 0; i < winningPot.length; i++) {
            int ball;

            do {
                ball = random.nextInt(45);
            }while (pot[ball] == 0);

            winningPot[i] = pot[ball];
            pot[ball] = 0;
        }

        System.out.println("로또 번호: " + Arrays.toString(winningPot));
    }

}
