package lang.immutable.address;

/*
시나리오

a와 b는 인스턴스를 공유한다.
b가 인스턴스의 필드 값 변경을 시도한다.
그러나 이 객체는 불변으로, 모든 필드가 private final로 선언되어 있으며 setter를 제공하지 않는다.
변경을 포기하고 새로운 인스턴스를 생성자를 통해 변경하고자 했던 값으로 필드를 초기화하고 만든다.
 */
public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // a와 b는 같은 인스턴스를 가리킨다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); // 호출 안됨. 애초에 없고, 필드도 final임. 이중으로 막혀있음.
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}
