package lang.immutable.address;

/*
시나리오
Address 타입 참조변수 a와 b는 같은 인스턴스를 참조한다.
참조변수 b를 통해 setValue() 메서드를 호출하여 value 값을 변경한다.
a는 아무런 행동도 취하지 않았음에도 인스턴스의 value가 변경된다.
 */
public class RefMain1 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.

        Address a = new Address("서울");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
