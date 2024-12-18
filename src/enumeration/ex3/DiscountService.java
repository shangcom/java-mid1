package enumeration.ex3;

public class DiscountService {

    /*
    classGrade의 메모리 주소와 ClassGrade.BASIC의 메모리 주소가 같아야 조건이 참이 됨.
     */
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade == Grade.BASIC) {
            discountPercent = 10;
        } else if (grade == Grade.GOLD) {
            discountPercent = 20;
        } else if (grade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 없음");
        }
        return price * discountPercent / 100;
    }
}
