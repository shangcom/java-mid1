package exception.ex4;

import exception.ex4.exception.ConnectionExceptionV4;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

/*
Service의 sendMessage() 메서드가 예외처리를 하지 않기 때문에, 마지막 호출자인 이곳에서 공통으로 처리.
예외 발생 시 사용자 메시지와 개발자 메시지를 분리.
 */
public class MainV4 {
    public static void main(String[] args) {

//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            // 예외 발생 가능성 있는 sendMessage()를 try로 감싸고, 공통 처리기인 exceptionHander()로 catch하여 정상흐름으로 만든다.
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    /*
    공통 예외 처리
     */
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메시지 ==");
        e.printStackTrace(System.out);

        if (e instanceof ConnectionExceptionV4 connectionEx) {
            System.out.println("[연결 오류] 연결 주소: " + connectionEx.getAddress());
        }
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }

}
