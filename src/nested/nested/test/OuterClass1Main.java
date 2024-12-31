package nested.nested.test;

public class OuterClass1Main {
    public static void main(String[] args) {
        // 여기에서 NestedClass의 hello() 메서드를 호출하라.
        OuterClass1.NestClass nested = new OuterClass1.NestClass();
        nested.hello();
    }
}
