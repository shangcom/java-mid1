package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        String str1 = "hello"; // 자바가 자동으로 new String("hello"); 로 변경함.
        String str2 = new String("hello");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
