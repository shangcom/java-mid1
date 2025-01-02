package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        // 사요자 입력값 기반 오류 활성화
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
