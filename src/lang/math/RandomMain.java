package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        /*
        Random 클래스 : java.util에 있음.
        생성자에 seed값을 넣어 생성하면 반복 시행해도 처음 나왔던 값으로 고정된다.
        또한 seed 값이 같은 인스턴스들은 메서드 결과값이 값이 같다.
         */
//        Random random = new Random();
        Random random = new Random(1); // 인자로 seed 값을 주면 반복 시행해도 처음 나왔던 결과값이 고정된다.
        Random random2 = new Random(1); // 시드값이 같으므로 결과값이 같다.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        int randomInt2 = random2.nextInt();
        System.out.println("randomInt2 = " + randomInt2);


        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 0 이상, bound 미만 정수 반환
        int randomRange1 = random.nextInt(10); // 0 ~ 9 정수 반환.
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10 정수 반환.
        System.out.println("randomRange2 = " + randomRange2);
    }
}
