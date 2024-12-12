package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj ojb = new MutableObj(10);
        ojb.add(20);
        System.out.println("obj =  " + ojb.getValue());
    }
}
