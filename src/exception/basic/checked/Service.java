package exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     * 예외가 발생하면 try 블록의 나머지 부분은 실행되지 않고, 곧바로 catch 블록으로 이동한다.
     */
    public void callCatch() {
        try {
            client.call(); // throw new MyCheckedException("ex"); 예외 던짐.
        } catch (MyCheckedException e) { //위에서 던져진 MyCheckedException을 e라는 이름으로 받음.
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage()); // Throwable의 detailMessage 필드를 출력.
        } // 정상 흐름으로 돌아간다.
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드.
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 'throws'를 메서드 시그니쳐에 명시해야한다.
     * throws : 이 메서드는
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
