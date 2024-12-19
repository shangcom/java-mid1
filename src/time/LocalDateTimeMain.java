package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
LocalDateTime : LocalDate와 LocalTime 합친 것. 내부에 둘 다 필드로 가지고 있음.
 */
public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("현재 날짜시간 = " + nowDt);

        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 45);
        System.out.println("지정 날짜시간 = " + ofDt);

        //날짜(LocalDate)만 반환
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        //시간(LocalTime)만 반환
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        //날짜(LocalDate)와 시간(LocalTime) 합쳐서 LocalDateTime 반환
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        //계산(불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정날짜시간  + 1000d = " + ofDtPlus);

        LocalDateTime ofDtPlus10Years = ofDt.plusYears(10);
        System.out.println("지정날짜시간 + 10y = " + ofDtPlus10Years);

        //비교
        boolean before = nowDt.isBefore(ofDt);
        System.out.println("현재 날짜시간이 지정 날짜시간 이전인가? = " + before);

        boolean after = nowDt.isAfter(ofDt);
        System.out.println("현재 날짜시간이 지정 날짜시간 이후인가? = " + after);

        /*
        equals() 아닌 isEqual()이 따로 있는 이유
        isEquals()는 오직 시간만 비교. 타임존이 달라도 시간이 같으면 true 반환
        equals()는 모든 필드를 비교. 모두 같아야 true 반환.
         */
        boolean equal = nowDt.isEqual(ofDt);
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? = " + equal);
    }
}
