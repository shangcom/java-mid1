package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String authGrade = scanner.next();
        scanner.nextLine();
        if (authGrade.equals(AuthGrade.GUEST.name())) {
            System.out.println("당신의 등급은 " + AuthGrade.GUEST.name() + "입니다.");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
        } else if (authGrade.equals(AuthGrade.LOGIN.name())) {
            System.out.println("당신의 등급은 " + AuthGrade.LOGIN.name() + "입니다.");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (authGrade.equals(AuthGrade.ADMIN.name())) {
            System.out.println("당신의 등급은 " + AuthGrade.ADMIN.name() + "입니다.");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
        } else {
            throw new IllegalArgumentException("없는 등급입니다.");
        }
    }
}
