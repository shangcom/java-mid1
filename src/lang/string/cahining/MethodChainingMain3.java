package lang.string.cahining;

/*
메서드 체이닝은 반환되는 객체를 통해 연속적인 호출을 가능하게 만드는 방식.
여기서는 인스턴스 자기 자신을 반환(정확하게는 자신의 참조를 반환)하는 메서드를 통해
반환 객체는 꼭 자기 자신일 필요 없음. 다른 객체라도 다음 메서드 호출이 가능하면 체이닝이 가능.
 */
public class MethodChainingMain3 {
    public static void main(String[] args) {

        // adder = x001
        ValueAdder adder = new ValueAdder();
        /*
        add()메서드는 인스턴스 자신을 반환한다.
        반환된 참조값을 즉시 사용해서 바로 다음 메서드를 호출.

        x001.add(1).add(2).add(3).getValue();
        x001.add(2).add(3).getValue();
        x001.add(3).getValue();
        x001.getValue();
         */
        int result  = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
