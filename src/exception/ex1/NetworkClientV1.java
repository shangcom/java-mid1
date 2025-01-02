package exception.ex1;

public class NetworkClientV1 {

    private final String adress;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String adress) {
        this.adress = adress;
    }

    // 연결
    public String connect() {
        // 연결 실패 : connectError 오류코드 반환
        if (connectError) {
            System.out.println(adress + " 서버 연결 실패");
            return "connectError";
        }
        // 연결 성공
        System.out.println(adress + " 서버 연결 성공");
        return "success";
    }

    // 전송
    public String send(String data) {
        // 전송 실패 : sendError 오류코드 반환
        if (sendError) {
            System.out.println(adress + " 서버 데이터 전송 실패 " + data);
            return "connectError";
        }
        // 전송 성공
        System.out.println(adress + " 서버에 데이터 전송: " + data);
        return "success";
    }

    // 연결 해제
    public void disconnect() {
        System.out.println(adress + " 서버 연결 해제");
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
