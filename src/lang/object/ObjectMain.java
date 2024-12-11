package lang.object;

public class ObjectMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString() : Object 클래스의 메서드. Child는 Parent를, Parent는 Object를 상속했으므로 Child 객체에서 사용 가능.
        String string = child.toString();
        System.out.println("string = " + string);
    }
}
