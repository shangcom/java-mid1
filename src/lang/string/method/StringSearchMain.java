package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {

        /*
         'Java' 두 번 포함
         첫 번째 : 인덱스 7
         두 번째 : 인덱스 24
         */
        String str = "Hello, Java! Welcome to Java world.";

        // 특정 문자열이 포함되어 있는지 확인 (true 또는 false 반환)
        System.out.println("문자열에 'Java'가 포함되어 있는지: " + str.contains("Java"));
        // 특정 문자열이 처음으로 나타나는 시작 인덱스 반환
        System.out.println("'Java'의 첫 번째 인덱스: " + str.indexOf("Java"));
        // 특정 문자열을 특정 인덱스부터 검색 시작 (부분 문자열 탐색)
        System.out.println("인덱스 10부터 'Java'의 인덱스: " + str.indexOf("Java",10));
        // 특정 문자열이 마지막으로 등장하는 시작 인덱스 반환 (끝에서부터 검색)
        System.out.println("'Java'의 마지막 인덱스: " + str.lastIndexOf("Java"));
    }
}
