package lang.math;

public class MathMain {
    public static void main(String[] args) {

        // 기본 연산 메서드
        int max = Math.max(10, 20); // 최대값
        int min = Math.min(10, 20); // 최소값
        int abs = Math.abs(-10); // 절대값

        // 반올림 및 정밀도 메서드
        double ceil = Math.ceil(2.13); // 올림
        double floor = Math.floor(2.13); // 내림
        long round = Math.round(2.5); // 반올림

        // 기타 유용한 메서드
        double sqrt = Math.sqrt(9); // 제곱근
        double random = Math.random(); // 0.0 ~ 1.0 사이의 double값

    }
}
