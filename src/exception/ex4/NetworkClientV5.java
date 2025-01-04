package exception.ex4;


import exception.ex4.exception.ConnectionExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/*
AutoCloseable 인터페이스 구현.
close() 메서드는 AutoCloseable을 구현한 이 클래스가 자원으로 사용된 try 블럭이 종료되거나, 예외가 발생해서 try 블럭을 빠져나갈 때 자동으로 실행된다.
즉, 예외가 발생해서 정상 흐름에서 빠져나가게 됐을 경우에도 close()가 먼저 실행된 뒤 catch 블럭이 실행된다.
자원은 어차피 try 블럭 안에서만 사용되므로, 먼저 자원을 반납하는 것이 논리적으로 맞다.
finally보다 자원을 더 빨리 해제할 수 있다.
원래 throws Exception 달려있는데, disconnect() 메서드는 예외를 던지지 않으므로 지웠음.
 */
public class NetworkClientV5 implements AutoCloseable{

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void connect() {
        if (connectError) {
            throw new ConnectionExceptionV4(address, address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
//            throw new RuntimeException("ex"); // 알 수 없는 오류 확인용
        }
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }


    @Override
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
