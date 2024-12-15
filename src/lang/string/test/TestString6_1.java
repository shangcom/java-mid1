package lang.string.test;

/*
답안 : 여기서는 hello 찾으면 e부터 다시 탐색.
 */
public class TestString6_1 {
    public static void main(String[] args) {
        String str = "start hellohello java, hello spring, hellohello jpa";
        String key = "hello";

        int keyIndex = str.indexOf(key);
        int count = 0;

        while (keyIndex >= 0) {
            count++;
            keyIndex = str.indexOf(key, keyIndex + 1);
        }
        System.out.println("count = " + count);
    }
}
