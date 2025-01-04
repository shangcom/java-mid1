package exception.ex4;

/*
AutoCloseable을 구현한 NetworkClientV5 사용.
try 블럭에서 사용할 자원을 명시하고, 인스턴스 생성해서 사용한다.
finally 블럭에서 client.close() 하던 것을, AutoCloseable를 구현한 Client를 사용함으로써
try 블럭이 종료될 때 구현한 close()메서드가 자동으로 실행된다.
finally 블럭 제거해도 됨.

client가 try 블럭 안에서만 사용 가능해졌으므로, initError() 메서드를 옮겼음.
 */
public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        }
        // 이 부분은 없어도 됨. 그냥 예외 확인용.
        catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
