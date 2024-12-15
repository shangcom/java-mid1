package lang.string.cahining;

public class MethodChainingMain2 {
    public static void main(String[] args) {

        /*
         add() : ValueAdder 객체 자기 자신의 참조값을 반환.
         adder ~ adder3까지 전부 같은 인스턴스를 참조한다.
         */
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);


        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("adder = " + adder);
        System.out.println("adder1 = " + adder1);
        System.out.println("adder2 = " + adder2);
        System.out.println("adder3 = " + adder3);
    }
}
