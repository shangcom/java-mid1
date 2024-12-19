package time;

import java.time.ZoneId;

/*
"Asia/Seoul" 같은 타임존 안에는 일광 절약 시간제에 대한 정보와 UTC+9:00와 같은 UTC로 부터 시간 차이인 오프셋 정보를 모두 포함하고 있다.
 */
public class ZoneIdMain {
    public static void main(String[] args) {

        for (String availableZonedId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZonedId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        // ZoneId.systemDefault(): 시스템이 사용하는 기본 ZoneId를 반환한다.
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault() = " + zoneId);

        //ZoneId.of(): 타임존을 직접 제공해서 ZoneId를 반환한다.
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
