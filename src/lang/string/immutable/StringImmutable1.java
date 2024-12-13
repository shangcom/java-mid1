package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {

        String str = "hello";
        str.concat(" java"); // 불변객체라서 필드 수정 불가. 새로운 객체를 반환함.
        System.out.println("str = " + str);
    }
}
