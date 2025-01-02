package exception.basic.checked;

/*
체크 예외를 밖으로 던지는 코드.
 */
public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException { // 끝까지 던짐

        Service service = new Service();
        /*
         callThrow() 메서드 내부에서 발생한 예외를 호출자에 던짐.
         호출자는 main 메서드.
         여기가 최종이므로 반드시 처리해줘야한다.
         main 메서드에서 다시 throws를 통해 던지면 프로그램 종료된다.
         즉, 체크 예외도 호출자들이 명시적으로 처리하지 않으면 사실상 처리되지 않는 것과 같다.
         */
        service.callThrow();
        System.out.println("정상 종료");
    }

}
