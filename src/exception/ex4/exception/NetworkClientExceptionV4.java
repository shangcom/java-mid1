package exception.ex4.exception;

/*
RuntimeException 상속.
 */
public class NetworkClientExceptionV4 extends RuntimeException{
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
