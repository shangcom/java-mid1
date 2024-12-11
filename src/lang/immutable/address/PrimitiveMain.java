package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a의 값을 복사해서 b를 초기화. 둘이 전혀 별개의 값이고, 별도의 메모리 공간에 존재.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20; // a와 a의 값인 10은 메모리에서 별도의 공간에 존재하므로 b의 값을 바꿔도 영향을 받지 않는다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
