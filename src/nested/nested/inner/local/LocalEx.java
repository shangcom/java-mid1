package nested.nested.inner.local;

public class LocalEx {

    void process(int num) {
        class Local {
            void print() {
                System.out.println("Number: " + num);
            }
        }
        Local local = new Local();
        local.print();
    }

}
