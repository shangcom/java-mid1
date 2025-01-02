package exception.basic.unchecked;

public class Client {

    /*
    체크 예외와 달리, catch나 throws를 적지 않아도 오류 발생하지 않는다.
    즉. 컴파일러가 예외 처리를 강제하지 않는다.
     */
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
