package lang.wrapper;

/*
 오토박싱/언박싱 : 컴파일러가 valueOf(), xxxValue() 자동으로 추가
 */
public class AutoBoxingMain2 {
    public static void main(String[] args) {

        int value = 7;
        // 오토박싱 : 기본형 -> 래퍼 클래스
        Integer boxedValue = value;
        // 오토언박싱 : 래퍼 클래스 -> 기본형
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

        
    }
}
