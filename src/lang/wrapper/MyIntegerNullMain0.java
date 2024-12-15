package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {

        int[] intArr = {-1, 0, 1, 2, 3};

        /*
        -1은 있고 100은 없는데 둘 다 -1 반환함.
         */
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 100));

    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }

}
