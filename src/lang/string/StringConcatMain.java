package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        /*
         참조변수 끼리의 합????
         아니! 이렇게 입력하면 자바 언어에서 편의상 특별히 + 연산을 제공. 문자열 연결해줌.
         */
        String result2 = a + b;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
