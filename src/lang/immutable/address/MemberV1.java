package lang.immutable.address;

public class MemberV1 {
    private String name;
    private Address address;

    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", address=" + address + // 여기서도 address 참조 변수를 문자열로 변환하기 위해 address.toString() 자동으로 호출.
                '}';
    }
}
