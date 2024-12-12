package lang.immutable.address;

public class MemberV2 {
    private String name;
    private ImmutableAddress immutableAddress;

    public MemberV2(String name, ImmutableAddress immutableAddress) {
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public ImmutableAddress getAddress() {
        return immutableAddress;
    }

    public void setImmutableAddress(ImmutableAddress immutableAddress) {
        this.immutableAddress = immutableAddress;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + immutableAddress + // 여기서도 address 참조 변수를 문자열로 변환하기 위해 address.toString() 자동으로 호출.
                '}';
    }
}
