package lang.string.test;
/*
split()를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
 */
public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";

        String[] strings = email.split("@");

        String idPart = strings[0];
        String domainPart = strings[1];

        System.out.println("ID = " + idPart);
        System.out.println("Domain = " + domainPart);
    }
}
