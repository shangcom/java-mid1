package lang.wrapper;
/*
래퍼 클래스 제공 메서드
 */
public class WrapperUtilsMain {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자 -> wrapper
        Integer i2 = Integer.valueOf("10"); // String -> wrapper
        int intValue = Integer.parseInt("10"); // String -> int

        // 비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        // 산술 연산
        System.out.println("sum: " + Integer.sum(10, 20));
        System.out.println("min: " + Integer.min(10, 20));
        System.out.println("max: " + Integer.max(10, 20));
    }
}
