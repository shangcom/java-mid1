package exception.ex1;

/*
NetworkClient는 학습 목적으로 간소화된 클래스이지만, 네트워크 연결이라는 한정된 리소스를 관리하는 클래스를 모사한다.
네트워크 연결은 외부 시스템과의 통신에 필수적이며, 사용 후 반드시 해제해야 하는 자원임.

Spring 프로젝트로 치면, NetworkClient에 해당하는 것은 외부 시스템과의 네트워크 연결이나 리소스를 관리하는 컴포넌트들.
RestTemplate, WebClient, JdbcTemplate, RabbitTemplate 등
이들은 모두 네트워크 연결 리소스를 다루며, 자원 해제와 안정성을 보장하는 역할을 수행.
 */
public class NetworkClientV1 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    // 연결
    public String connect() {
        // 연결 실패 : connectError 오류코드 반환
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    // 전송
    public String send(String data) {
        // 전송 실패 : sendError 오류코드 반환
        if (sendError) {
            System.out.println(address + " 서버 데이터 전송 실패 " + data);
            return "sendError";
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    // 연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    /*
    입력한 문자열에 "error1"이 포함되어있으면 connectError를 true로
    입력한 문자열에 "error2"이 포함되어있으면 sendError를 true로
     */
    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
