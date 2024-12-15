package lang.string.test;
/*
replace()를 사용해서 java라는 단어를 jvm으로 변경해라.
 */
public class TestString8 {
    public static void main(String[] args) {
        String input = "hello java spring jpa java";

        String result = input.replace("java", "jvm");
        System.out.println(result);
    }
}
