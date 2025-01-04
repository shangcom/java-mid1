package exception.ex2;

/*
해결한 문제 : disconnect()를 finally 블럭으로 옮김.
            finally는 처리할 수 없는 예외가 발생해도 반드시 실행된다.
            정상흐름으로 돌릴 수는 없어도, disconnect()는 실행된다.
            즉, finally를 실행하고 난 뒤, 처리하지 못한 예외를 밖으로 던진다.
 */
public class NetworkServiceV2_5 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
