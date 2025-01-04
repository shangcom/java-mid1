package exception.ex4;

/*
try 블럭에서 언체크예외가 발생할 수 있음.
언체크예외라서 처리하지 않아도 됨.
throws도 붙이지 않아도 됨.
예외 발생하면 자동으로 던진다.
 */
public class NetworkServiceV4 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } finally {
            client.disconnect();
        }
    }
}
