package nested.nested.inner.local;

public class LocalExMain {
    public static void main(String[] args) {

        LocalEx outer = new LocalEx();
// 메서드 내부에서 클래스를 선언하고 인스턴스를 생성하여 메서드 실행까지 한다.
//출력: Number: 10
        outer.process(10);
    }
}
