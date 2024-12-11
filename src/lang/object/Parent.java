package lang.object;

/*
명시적 상속이 없는 경우, 묵시적으로 Object 클래스를 상속한다.
 */
public class Parent extends Object{
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
