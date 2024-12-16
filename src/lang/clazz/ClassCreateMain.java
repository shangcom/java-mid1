package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {

        /*
        문자열로 Class클래스 얻기.
        활용?
        사용자의 문자열 입력을 받아 객체를 동적으로 생성할 수 있음
         */
        Class<?> helloClass = Class.forName("lang.clazz.Hello");

        /*
        .getDeclaredConstructor() : 생성자 선택
        .newInstance() : 선택한 생성자로 인스턴스 생성
         */
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
