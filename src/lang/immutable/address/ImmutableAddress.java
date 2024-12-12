package lang.immutable.address;

public class ImmutableAddress {

//    private String value;
    private final String value; //final로 선언

    // 객체 생성시 생성자로 필드 초기화
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // final 필드 수정 불가
//    public void setValue(String value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
