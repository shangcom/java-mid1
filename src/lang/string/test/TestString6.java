package lang.string.test;

/*
str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
indexOf()를 반복문과 함께 풀면 된다.
 */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hellohello java, hello spring, hellohello jpa";
        String key = "hello";

        int keyIndex = str.indexOf(key);
        int count = 0;

        while (keyIndex != -1) {
            count++;
            keyIndex = str.indexOf(key, keyIndex + key.length());
        }
        System.out.println("count = " + count);
    }
}
