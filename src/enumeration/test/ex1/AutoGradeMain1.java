package enumeration.test.ex1;

/*
AuthGradeMain1이라는 클래스를 만들고 다음 결과가 출력되도록 코드를 작성해라.
앞서 만든 AuthGrade을 활용하자
grade=GUEST, level=1, 설명=손님
grade=LOGIN, level=2, 설명=로그인 회원
grade=ADMIN, level=3, 설명=관리자
 */
public class AutoGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            System.out.println(authGrade);
        }
    }
}
