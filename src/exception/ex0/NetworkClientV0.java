package exception.ex0;

public class NetworkClientV0 {

    private final String address;

    public NetworkClientV0(String address) {
        this.address = address;
    }

    // 연결 성공
    public String connect() {
        System.out.println(address + " 서버 연결 성공");
        return "connected successfully";
    }

    // 전송 성공
    public String send(String data) {
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "send successfully";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }
}
