package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {

        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basicPrice = discountService.discount(Grade.BASIC, price);
        int goldPrice = discountService.discount(Grade.GOLD, price);
        int diamondPrice = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basicPrice = " + basicPrice);
        System.out.println("goldPrice = " + goldPrice);
        System.out.println("diamondPrice = " + diamondPrice);
    }
}
