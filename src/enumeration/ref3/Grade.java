package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discountPercent;
    Grade(int discountPercnetage) {
        this.discountPercent = discountPercnetage;
    }

    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
