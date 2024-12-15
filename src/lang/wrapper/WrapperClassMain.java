package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {

        /*
        생성자 필드 초기화 삭제 예정
        대신 valueOf() 메서드 사용해야.
         */
        Integer newInteger = new Integer(10); // 빨간줄 나옴.

        /*
         Java는 Integer 클래스에 -128~127까지, 자주 사용하는 숫자로 Integer 객체 미리 만들어둠(캐싱)
         -> 성능 최적화.
         -128~127 범위 벗어난 숫자를 valueOf()에 인자로 전달하면, 그때 new Integer(숫자)를 호출한다.
         여기서는 10을 전달했으므로 캐싱되어있는 10에 해당하는 객체를 반환한다.
         따라서 integer와 integerObj는 10 값을 가지고 있는 같은 객체를 참조한다.
         */
        Integer integer = Integer.valueOf(10);
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubeObj = Double.valueOf(10.5);

        // 각 wrapper 클래스는 필드값 출력하도록 toString() 메서드 오버라이드 돼있음.
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubeObj = " + doubeObj);

        // 내부값(필드값) 꺼내기
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        double doubleValue = doubeObj.doubleValue();

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        // 비교
        System.out.println("비교");
        System.out.println("==: " + (newInteger == integerObj)); // 동일성
        System.out.println("캐싱 확인:" + (integerObj == integer)); // valueOf(10)로 생성했기 때문에 캐싱된 같은 객체를 참조한다.
        System.out.println("equals: " + integerObj.equals(newInteger)); // 동등성


    }
}
