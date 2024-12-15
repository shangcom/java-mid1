package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {

        String strWithSpaces = "   Java Programming   ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        // trim() : ASCII 공백 문자만 (\u0020, 즉 "스페이스") 제거 가능.
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");
        // strip() : 다양한 유니코드 공백 문자(예: \u00A0, \u2002, \t)도 제거
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWithSpaces.stripTrailing() + "'");
    }
}
