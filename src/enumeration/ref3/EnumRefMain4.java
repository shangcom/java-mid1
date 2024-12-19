package enumeration.ref3;

public class EnumRefMain4 {
    public static void main(String[] args) {

        int price = 10000;

        Grade[] grades = Grade.values();
        printAllDiscounts(grades, price);
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " + grade.discount(price));
    }

    private static void printAllDiscounts(Grade[] grades, int price) {
        for (Grade grade : grades) {
            printDiscount(grade, price);
        }
    }
}
