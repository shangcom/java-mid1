package time;

import java.time.LocalDate;
import java.time.Period;

/*
두 날짜 사이의 간격을 년, 월, 일 단위로 나타낸다.
 */
public class PeriodMain {
    public static void main(String[] args) {

        /*
         of(): 특정 기간을 지정해서 Period를 생성한다.
         of(년, 월, 일)
         ofDays()
         ofMonths()
         ofYears()
         */
        Period period = Period.ofDays(10); //10일
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = currentDate.plus(period);
        System.out.println("currentDate = " + currentDate);
        System.out.println("plusDate = " + plusDate);

        // getMonths() : 기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 : " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
