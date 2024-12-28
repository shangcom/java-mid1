package nested.nested.inner;

/*
내부 클래스는 바깥 클래스의 인스턴스에 소속되어야 한다. 따라서 내부 클래스를 생성할 때, 바깥 클래스의
인스턴스 참조가 필요하다.
outer.new Inner()에서 outer는 바깥 클래스의 인스턴스 참조를 가진다.
outer.new Inner()로 생성한 내부 클래스는 개념상 바깥 클래스의 인스턴스 내부에 생성된다.
따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.
 */
public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
