package lang.string.cahining;

public class MethodChainingMain1 {
    public static void main(String[] args) {

        /*
        add() : ValueAdder 객체 자기 자신의 참조값을 반환.
        여기서는 반환값 받지 않았음.
         */
        ValueAdder adder = new ValueAdder();
        adder.add(1);
        adder.add(2);
        adder.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);
    }
}
