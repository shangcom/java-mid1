package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC = " +refValue( Grade.BASIC ));
        System.out.println("ref BASIC = " +refValue( Grade.GOLD ));
        System.out.println("ref BASIC = " +refValue( Grade.DIAMOND ));


    }

    /*
    열거형 toString()은 열거형 상수의 이름을 반환함.
    따라서 주소 확인하려면 따로 메서드 작성해줘야함.
     */
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
