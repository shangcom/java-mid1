package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {

        LocalTime nowTime = LocalTime.now();
        System.out.println("nowTime = " + nowTime);

        LocalTime ofTime = LocalTime.of(7, 35);
        System.out.println("ofTime = " + ofTime);

        //계산(불변)
        LocalTime ofTimePlus = ofTime.plusHours(5);
        System.out.println("ofTimePlus = " + ofTimePlus);

    }
}
