package lang.string.test;
/*
length()를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
실행 결과에 맞도록 출력하자.
 */
public class TestString2 {
    public static void main(String[] args) {

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};

        int sum = 0;
        for (String string : arr) {
            System.out.println(string + ":" + string.length());
            sum += string.length();
        }

        System.out.println("sum = " + sum);
    }
}
