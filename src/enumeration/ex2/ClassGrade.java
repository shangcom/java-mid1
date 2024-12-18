package enumeration.ex2;
/*
각 객체들은 특별한 기능도 의미도 없지만, 메모리 주소를 비교하는 방식(참조비교)으로 활용됨.

제한된 인스턴스 생성: 클래스는 사전에 정의된 몇 개의 인스턴스만 생성하고, 외부에서는 이 인스턴스들만 사용할 수 있도록 한다.
이를 통해 미리 정의된 값들만 사용하도록 보장한다.

타입 안전성: 이 패턴을 사용하면, 잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있다.
특정 메서드가 특정 열거형 타입의 값을 요구한다면, 오직 그 타입의 인스턴스만 전달할 수 있다.
여기서는 메서드의 매개변수로 ClassGrade를 사용하는 경우, 앞서 열거한 BASIC, GOLD, DIAMOND만 사용할 수 있다.
 */
public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //
    private ClassGrade() {
    }
}
