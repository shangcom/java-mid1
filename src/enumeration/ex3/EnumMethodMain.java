package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 열거형 상수 반환
        Grade[] values = Grade.values();

        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name = " + value.name()  + ", ordinal = " + value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // 내부적으로 toString 호출되고 GOLD 상수의 이름 반환


    }
}
