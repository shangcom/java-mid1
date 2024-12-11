package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // 동일성(identity) 비교 : 두 객체의 메모리 주소(참조값)이 같은지 비교. 두 참조 변수가 동일한 객체를 가리키고 있는지 확인.
        System.out.println("identity = " + (user1 == user2));
        
        // 동등성(eqaulity) 비교 : 두 객체가 내용적으로 같은지 비교. 객체 내부의 값(필드)을 피교해 동등성을 판단.
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
