package exception.ex3.exeption;

/*
전송 실패 시 발생하는 예외. NetworkClientExceptionV3 상속.
내부에 전송 시도한 데이터 sendData를 보관.
 */
public class SendExceptionV3 extends NetworkClientExceptionV3{

    private String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
