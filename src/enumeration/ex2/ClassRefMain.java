package enumeration.ex2;

public class ClassRefMain {
    /*
    static이므로 애플리케이션 로딩 시점에 다음과 같이 3개의 ClassGrade 인스턴스가 생성되고, 각각의 상수는 같
    은 ClassGrade 타입의 서로 다른 인스턴스의 참조값을 가진다.
     */
    public static void main(String[] args) {
        System.out.println("클래스는 같음.");
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("참조변수는 다름.");
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
