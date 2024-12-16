package lang.wrapper;

/*
기본형 <-> 래퍼 클래스 변환
메서드 호출하는거 불편함
 */
public class AutoBoxingMain1 {
    public static void main(String[] args) {

        int value = 7;
        // 기본형 -> 래퍼 클래스
        Integer boxedValue = Integer.valueOf(value);
        // 래퍼 클래스 -> 기본형
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);


    }
}
