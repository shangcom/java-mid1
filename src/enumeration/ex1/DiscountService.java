package enumeration.ex1;

/*
등급(grade)에 문자열 상수사용
discount()에 인자를 전달할 때도 StringGrade가 제공하는 문자열 상수를 사용하면 된다.
실수로 상수의 이름을 잘못 입력하면 컴파일 시점에 오류가 발생한다는 점이다. 따라서 오류를 쉽고 빠르게 찾을 수 있다.

문제점
String 타입은 어떤 문자열이든 입력할 수 있기 때문이다. 어떤 개발자가 실수로 StringGrade에 있는 문자열 상수를 사용하지 않고,
직접 문자열을 사용해도 막을 수 있는 방법이 없다.

discount() 메서드가 String을 매개변수로 받는 한 계속 발생하는 문제임.
 */
public class DiscountService {

    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals(StringGrade.BASIC)) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인 없음");
        }
        return price * discountPercent / 100;
    }
}
