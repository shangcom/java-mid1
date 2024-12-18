package lang.wrapper.test;
/*
String str을 Integer로 변환해서 출력해라.
Integer를 int로 변환해서 출력해라.
int를 Integer로 변환해서 출력해라.
오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.

실행 결과
integer1 = 100
intValue = 100
integer2 = 100
 */
public class WrapperTest4 {
    public static void main(String[] args) {

        String str = "100";
        Integer integer1 = Integer.valueOf(str); // valueOf() : Integer 반환
//        Integer integer1 = Integer.parseInt(str); // int 반환

        int intValue = integer1;

        int integer2 = intValue;

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
