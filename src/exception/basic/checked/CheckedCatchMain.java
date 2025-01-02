package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {

        Service service = new Service();

        // callCatch() 메서드 내부에서 catch로 예외 처리하고 정상흐름 반환.
        service.callCatch();

    }
}
