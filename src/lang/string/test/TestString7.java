package lang.string.test;
/*
문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"
 */
public class TestString7 {
    public static void main(String[] args) {
        String original = "    Hello Java   ";

        String strip = original.strip();
        System.out.println("strip = " + strip);
    }
}
