package nested.nested.inner.local;

import java.lang.reflect.Field;

/*
지역 변수 두 개.
int paramVar : process 메서드의 매개변수
int localVar : 메서드 내부에서 선언된 지역변수.

이 둘을 컴파일러에 의해 final로 변경되고, 지역 클래스에 캡쳐되어 사용된다.
캡쳐 : 지역 클래스의 숨겨진 필드로 복사됨을 의미.
즉, 지역 클래스 안에 개발자가 직접 선언한 필드가 아니더라도, 지역 클래스가 속한 메서드에 포함되는 지역 변수들은
지역 변수의 인스턴스가 생성될 때 final 필드로 자동으로 편입된다.
 */
public class LocalOuterV3 {

    private int outInstanceVar = 3; // 외부 클래스의 인스턴스 변수.

    public Printer process(int paramVar) {
        int localVar = 1; // 사실상 final. 구조상 값이 변할 일이 없음.
//        localVar = 2;   // 지역 클래스가 접근하는 지역 변수는 중간에 값이 변하면 안된다.
        class LocalPrinter implements Printer{
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar); // localVar=2; 살리면 여기 빨간줄.
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        Printer printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] Fields = printer.getClass().getDeclaredFields();
        for (Field field : Fields) {
            System.out.println("field = " + field);
        }

    }
}
