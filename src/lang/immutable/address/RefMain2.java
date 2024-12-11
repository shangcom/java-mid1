package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a; // a와 b는 같은 인스턴스를 가리킨다.
//        Address b = new Address("서울"); // a와 b를 각각 다른 인스턴스로 초기화한다. -> 서로 다른 인스턴스를 가리킨다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산"); // b의 값을 부산으로 변경해야만 하는 상황 발생.
        change(b, "부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
