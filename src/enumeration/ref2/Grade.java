package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;
    Grade(int discountPercnetage) {
        this.discountPercent = discountPercnetage;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
