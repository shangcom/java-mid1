package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2: " + str1.equals(str2)); //동일성 비교
        System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

        System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); //사전순 비교(어떤게 사전에서 먼저 나오나?)
        System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
        System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2)); //대소문자 안따지고 사전순 비교

        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello")); // 문자열이 특정 접두사로 시작하는지 확인한다.
        System.out.println("str1 ends with 'Java!': " + str1.endsWith("Java!")); // 문자열이 특정 접두사로 시작하는지 확인한다.
    }
}
