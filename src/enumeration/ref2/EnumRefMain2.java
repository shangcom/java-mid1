package enumeration.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {

        int price = 100000;
        DiscountService discountService = new DiscountService();
        int basicPrice = discountService.discount(Grade.BASIC, price);
        int goldPrice = discountService.discount(Grade.GOLD, price);
        int diamondPrice = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basicPrice = " + basicPrice);
        System.out.println("goldPrice = " + goldPrice);
        System.out.println("diamondPrice = " + diamondPrice);
    }
}
