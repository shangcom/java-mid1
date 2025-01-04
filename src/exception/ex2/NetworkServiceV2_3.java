package exception.ex2;

/*
해결된 문제 : 자바의 예외 처리 메커니즘과 try, catch 구조 덕분에 정상 흐름은 try 블럭에 모아서 처리하고,
            예외 흐름은 catch 블럭에 별도로 모아서 처리할 수 있었다.
            덕분에 정상 흐름과 예외 흐름을 명확하게 분리해서 코드를 더 쉽게 읽을 수 있게 되었다.
남은 문제 : 여전히 disconnect() 호출 안됨.
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        /*
        정상 흐름은 try 블럭, 예외 흐름은 catch 블럭에 각각 분리.
        예외가 발생하면 try 블록의 나머지 부분은 실행되지 않고, 곧바로 catch 블록으로 이동한다.
         */
        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

    }
}
