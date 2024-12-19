package time;

import java.time.LocalDate;

/*
모든 날짜 클래스는 불변.
변경이 발생하면 새로운 객체를 생성해서 반환함.
 */
public class LocalDateMain {
    public static void main(String[] args) {

        // now() : 현재 시간 기준 LocalDate 인스턴스 생성
        LocalDate now = LocalDate.now();
        System.out.println("오늘 날짜 = " + now);

        // of() : 지정 날짜 기준 LocalDate 인스턴스 생성
        LocalDate ofDate = LocalDate.of(2013, 11, 20);
        System.out.println("지정 날짜 = " + ofDate);

        //계산(불변) : LocalDate 객체 반환
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + plusDays);

    }
}
