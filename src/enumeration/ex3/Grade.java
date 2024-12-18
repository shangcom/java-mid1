package enumeration.ex3;

/*
열거형 (Enumeration)

java.lang.Enum를 자동(강제)으로 상속.
이미 상속 받았으므로 다른 클래스 상속 불가.
인터페이스 구현 가능.

열거형 상수 (Enumeration Constant) : enum 내부에 정의된 각 상수값.
상수는 사실 객체이고, 실제로 사용하는 것은 참조 주소.
즉 값이 아닌 객체의 참조를 상수로 정의한 것이고, 참조 주소를 기반으로 비교와 동작이 이루어진다.
상수는 static final 객체로 관리되며, 내부적으로 고유한 메모리 주소를 가짐.

name() : 상수의 이름 반환. 오버라이드 불가.
toString() : 상수 이름 반환. 오버라이드 가능.
ordinal() : 상수의 선언 순서 반환.
 */
public enum Grade {
    BASIC, GOLD, DIAMOND
}
