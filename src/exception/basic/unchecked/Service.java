package exception.basic.unchecked;

/*
Unchecked 예외는 예외를 잡거나 던지지 않아도 된다.
예외를 잡지 않으면 자동을 밖으로 던진다.
 */
public class Service {

    Client client = new Client();

    /**
     * 강제는 아니지만 필요한 경우 예외를 잡아서 처리할 수 있음.
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 발생한 예외를 처리하지 않으면 자동으로 호출자에 던진다.
     * throws 적지 않아도 된다.
     */
    public void callThrow() {
        client.call();
    }
}
