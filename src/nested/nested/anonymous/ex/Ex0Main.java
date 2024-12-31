package nested.nested.anonymous.ex;

/*
변하는 부분 : 문자열.
 */
public class Ex0Main {
 
    public static void helloJava() {
        System.out.println("프로그램 시작"); // 불변
        System.out.println("Hello Java"); // 가변
        System.out.println("프로그램 종료"); // 불변
    }

    public static void helloSpring() {
        System.out.println("프로그램 시작"); //불변
        System.out.println("Hello Spring"); // 가변
        System.out.println("프로그램 종료"); // 불변
    }


    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
