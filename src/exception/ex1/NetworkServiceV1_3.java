package exception.ex1;

/*
문제점
정상 흐름과 예외 흐름이 섞여있다.
정상 흐름은
        client.connect();
        client.send(data);
        client.disconnect();
이게 전부인데, 현재 코드에는 예외 흐름과 함께 뒤섞여 있다.

근본 원인 : 반환값을 사용해서 예외 상황을 처리하는 방식 때문.
정상 결과와 오류 상태를 같은 데이터 타입으로 반환.
예) NULL, -1 또는 0
특정 값(NULL, -1, 또는 0)을 "오류"로 간주하며, 정상 동작은 반환 값이 다른 값을 가지도록 설계.
반환값이 오류인지, 정상 결과인지 호출한 쪽에서 판단해야 한다.

1) 정상 값과 오류 값의 충돌
동일한 데이터 타입을 반환하므로, 오류 값이 정상 값과 구분되지 않을 수 있음.
예) -1이 나왔을 경우, 이것이 실제 계산 결과(정상값)인지, 오류를 나타내는 값인지 혼동됨.

2) 다양한 오류의 표현 한계
오류가 "파일 없음", "권한 없음", "디스크 가득 참" 등의 상황을 나타내야 할 경우, 반환 값으로 이를 모두 표현하기 어려움.

3) 오류 전파의 복잡성
반환 값으로 오류를 처리할 경우, 호출 스택 상위로 오류 정보를 전파하기 어려움.
오류를 상위 호출자에게 알리기 위해 매번 반환 값을 체크하고, 동일한 반환 값을 반환해야 하는 반복적인 코드가 필요

4) 코드 가독성 저하
정상 흐름과 예외 흐름이 섞이게 되어 코드의 가독성이 저하
 */
public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        // 사용자 입력값 기반 오류 활성화
        client.initError(data);


        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }

    // 부정형이라 헷갈려서 메서드로 빼냄.
    private static boolean isError(String result) {
        return !result.equals("success");
    }
}
