package exception.ex3.exeption;

/*
연결 실패시 발생하는 예외. NetworkClientExceptionV3 상속.
연결 시도한 address 보관.
 */
public class ConnectionExceptionV3 extends NetworkClientExceptionV3{

    private final String address;

    public ConnectionExceptionV3(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
