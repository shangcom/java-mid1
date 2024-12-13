package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        // str1과 str2는 new String()을 사용해서 각각 인스턴스를 생성했다.
        // 서로 다른 인스턴스이므로 동일성(==) 비교에 실패한다.
        // 둘은 내부에 같은 "hello" 값을 가지고 있기 때문에 논리적으로 같다. 따라서 동등성( equals()) 비교에 성
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello";
        String str4 = "hello";
        // 문자열 리터럴을 사용하는 경우 같은 참조값을 가지므로 == 비교에 성공
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

    }
}
