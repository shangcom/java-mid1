package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {

        /*
        정적 중첩 클래스는 Outer 클래스와 관련이 없다.
        정적 중첩 클래스의 인스턴스 생성할 때 Outer 클래스의 인스턴스나 생성자는 필요 없다.
        이와 달리 내부 클래스의 인스턴스를 생성할 때는, 내부 클래스는 Outer 클래스의 인스턴스에 포함되므로, Outer 클래스의 인스턴스를 통해서야 생성할 수 있다.
         */
//        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
