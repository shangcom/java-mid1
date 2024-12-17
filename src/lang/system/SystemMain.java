package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {

        //System.currentTimeMillis() : 현재시간(ms) 반환
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);


        //System.nano() : 현재시간(ns) 반환
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);


        //System.getenv() : 환경 변수들을 맵으로 반환
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);


        /*
         System.getProperties() : 시스템 속성 맵으로 반환
         System.getProperty(String key) : 특정 속성 반환
         */
        Properties properties = System.getProperties();
        String javaVersion = System.getProperty("java.version");

        System.out.println("properties = " + properties);
        System.out.println("javaVersion = " + javaVersion);


        // System.arraycopy() : 고속 배열 복사.
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];


        // 반복문 사용
//        for (int i = 0; i < originalArray.length; i++) {
//            copiedArray[i] = originalArray[i];
//        }

        // System.arraycopy 사용 : 반복문보다 훨씬 빠르다.
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);


        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println(Arrays.toString(copiedArray));


        // 프로그램 종료
        System.exit(0);
    }
}
