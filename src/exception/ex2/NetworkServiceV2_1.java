package exception.ex2;

/*
기존의 코드와 대부분 같지만, 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다.
따라서 반환 값을 사용하지 않아도 된다. 여기서는 반환 값을 void로 처리한다.
이전에는 반환 값으로 성공, 실패 여부를 확인해야 했지만, 예외 처리 덕분에 메서드가 정상 종료되면 성공이고,
예외가 던져지면 예외를 통해 실패를 확인할 수 있다.
오류가 발생하면, 예외 객체를 만들고 거기에 오류 코드와 오류 메시지를 담아둔다. 그리고 만든 예외 객체를 throw를 통해 던진다.

남은 문제점들 : 예외 처리를 도입했지만, 아직 예외가 복구되지 않는다. 따라서 예외가 발생하면 발생하면 프로그램이 종료된다.
              사용 후에는 반드시 disconnect()를 호출해서 연결을 해제해야 한다.
 */
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        // 사용자 입력값 기반 오류 활성화
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
