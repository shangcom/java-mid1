package enumeration.ex0;

/*
String 사용 시 문제점
- 타입 안정성 부족 : 값 제한하기 어려움.
- 데이터 일관성 : 대/소문자 구분 불가

오타 등의 사유로 존재하지 않는 등급을 인자로 넘겼을 경우?
어쨌던 문자열이 들어갔기 때문에 컴파일 오류 없이 실행된다.

 */
public class StringGradeEx0_2 {
    public static void main(String[] args) {

        DiscountService discountService = new DiscountService();
        int price = 10000;

        // 존재하지 않는 등급 "VIP"
        int vip = discountService.discount("VIP", price);
        System.out.println("VIP 등급의 할인 금액: " + vip);

        // 등급 오타
        int ddddiamond = discountService.discount("DDDDiamond", price);
        System.out.println("ddddiamond 등급의 할인 금액: " + ddddiamond);

        // 소문자 입력
        int basic = discountService.discount("basic", price);
        System.out.println("basic 등급의 할인 금액: " + basic);

    }
}
