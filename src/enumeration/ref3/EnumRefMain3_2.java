package enumeration.ref3;

public class EnumRefMain3_2 {
    public static void main(String[] args) {

        int price = 10000;

        System.out.println("basicPrice = " + Grade.BASIC.discount(price));
        System.out.println("goldPrice = " + Grade.GOLD.discount(price));
        System.out.println("diamondPrice = " + Grade.DIAMOND.discount(price));
    }
}
