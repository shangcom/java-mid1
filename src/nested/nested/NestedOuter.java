package nested.nested;

public class NestedOuter {

    private static int countClassValue = 3;
    public int outInstanceValue = 2;

    /*
    정적 중첩 클래스
    바깥 클래스의 인스턴스 멤버에 접근 못함.
    바깥 클래스의 클래스(static) 멤버에 접근 가능.
    특히, 바깥 클래스의 필드가 private이어도 접근 가능.
     */
    static class Nested {
        private int nestedInstanceValue = 1;


        public void print() {
            // 정적 중첩 클래스 자신의 멤버에 접근
            System.out.println("nestedInstanceValue = " + nestedInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근 못함.
//            System.out.println("outInstanceValue = " + outInstanceValue);

            // 바깥 클래스의 클래스(static) 멤버에 접근 가능. private이어도 접근 가능.
            System.out.println("countClassValue = " + countClassValue);
//            System.out.println(NestedOuter.countClassValue); // 스태틱 필드이므로 클래스명으로 불러와도 된다.
        }
    }

}
