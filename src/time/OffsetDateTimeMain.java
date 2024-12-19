package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
OffsetDateTime : LocalDateTime에 UTC 오프셋 정보인 ZoneOffset이 합쳐진 것이다.
                 시간대를 고려한 날짜와 시간을 표현할 때 사용한다.
                 타임존은 없고, UTC로 부터의 시간대 차이인 고정된 오프셋만 포함한다.
                 ZoneId가 없으므로 일광 절약 시간제가 적용되지 않는다.
 */
public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldt = " + ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
