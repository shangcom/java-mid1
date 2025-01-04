package exception.ex2;

/*
해결한 문제 : disconnect()를 try블럭에서 메서드의 맨 마지막 부분으로 이동시킴.
            try 블럭에서 예외가 발생하면, 블록 내에 나머지 부분은 실행하지 않고 바로 catch 블럭으로 넘어간다.
            따라서 try블럭의 첫번째 메서드인 connect()에서 예외가 발생하면 send()는 실행하지 않고 곧바로 catch()로 넘어가며,
            여기에서 예외가 처리되어 정상 흐름으로 돌아가고, 마지막 disconnect()가 실행된다.

남은 문제 : catch에서 처리 가능한 NetworkClientExceptionV2가 발생한 경우에는 disconnect()가 호출되지만,
          처리할 수 없는 예외가 발생하는 경우에는 정상흐름으로 돌아가지 못한다.
          따라서 disconnect() 실행 안됨.
 */
public class NetworkServiceV2_4 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }
        //NetworkClientException이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
        client.disconnect();
    }
}
