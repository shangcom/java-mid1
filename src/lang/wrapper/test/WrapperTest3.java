package lang.wrapper.test;
/*
String str을 Integer로 변환해서 출력해라.
Integer를 int로 변환해서 출력해라.
int를 Integer로 변환해서 출력해라.
오토 박싱, 오토 언박싱을 사용하지 말고 직접 변환해야 한다.

실행 결과
integer1 = 100
intValue = 100
integer2 = 100
 */
public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";
        Integer integer1 = Integer.valueOf(str);

        int intValue = integer1.intValue();

        int integer2 = Integer.valueOf(intValue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
