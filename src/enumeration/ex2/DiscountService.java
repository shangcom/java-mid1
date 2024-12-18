package enumeration.ex2;


public class DiscountService {

    /*
    classGrade의 메모리 주소와 ClassGrade.BASIC의 메모리 주소가 같아야 조건이 참이 됨.
     */
    public int discount(ClassGrade classGrade, int price) {
        int discountPercent = 0;

        if (classGrade == ClassGrade.BASIC) {
            discountPercent = 10;
        } else if (classGrade == ClassGrade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == ClassGrade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println("할인 없음");
        }
        return price * discountPercent / 100;
    }
}
