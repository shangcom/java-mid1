package lang.clazz;

import java.lang.reflect.Field;
/*
Class 클래스 : 클래스의 정보 모음.
 */
public class ClassMetaMain {
    public static void main(String[] args) throws ClassNotFoundException {

        /*
         클래스 조회하기
         방법1. 클래스에서 조회
         방법2. 인스턴스에서 조회
         방법3. 문자열로 조회
         */
        Class<String> clazz1 = String.class;
        Class<? extends String> clazz2 = new String().getClass();
        Class<?> clazz3 = Class.forName("java.lang.String");

        System.out.println("clazz1 = " + clazz1);
        System.out.println("clazz2 = " + clazz2);
        System.out.println("clazz3 = " + clazz3);

        /*
        클래스에 선언된 모든 필드 받아오기
         */
        Field[] declaredFields = clazz1.getDeclaredFields(); // String 클래스에 선언된 모든 필드의 배열
        for (Field field : declaredFields) {
            System.out.println("field = " + field.getType() + " " + field.getName());
        }

        /*
        클래스의 상위 클래스 확인
         */
        System.out.println("Superclass: " + clazz1.getSuperclass()); // String 클래스의 상위 클래스

        /*
        클래스가 구현(implements ~ )하는 인터페이스들 확인
         */
        Class<?>[] interfaces = clazz1.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
    }
}
