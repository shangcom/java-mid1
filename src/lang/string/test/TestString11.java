package lang.string.test;
/*
str 문자열을 반대로 뒤집어라.
StringBuilder에 있는 reverse()를 사용해라.
 */
public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder sb = new StringBuilder();
        String reversedString = sb.append(str).reverse().toString();
        System.out.println(reversedString);
    }
}
