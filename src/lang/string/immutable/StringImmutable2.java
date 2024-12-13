package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = str1.concat(" java"); // concat이 반환한, str1의 문자열 내용을 수정한 String 객체를 이용해 str2를 초기화.
        System.out.println("str = " + str2);
    }
}
