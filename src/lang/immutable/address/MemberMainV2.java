package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress immutableAddress = new ImmutableAddress("서울");

        // 같은 address 객체 공유.
        MemberV2 memberA = new MemberV2("회원A", immutableAddress);
        MemberV2 memberB = new MemberV2("회원B", immutableAddress);

        //회원 A, B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원 B의 주소를 부산으로 변경
//        memberB.getAddress().setValue("부산");
        memberB.setImmutableAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
