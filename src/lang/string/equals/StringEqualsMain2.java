package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

        String str5 = new String("hello");
        String str6 = "hello";
        System.out.println("메서드 호출 비교3: " + isSame(str5, str6));
    }

    /*
    isSame()의 경우 매개변수로 넘어오는 String 인스턴스가 new String()으로 만들어진 것인지, 문자열 리터럴로 만들어 진 것인지 확인할 수 있는 방법이 없다.
    그냥 equals() 쓰면 됨. 다른 생각할 필요 없음.
    */
    private static boolean isSame(String x, String y) {
//        return x == y;
        return x.equals(y);
    }
}
