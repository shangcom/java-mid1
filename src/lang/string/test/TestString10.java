package lang.string.test;
/*
split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라.
 */
public class TestString10 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinedString = fruits.join("->", splitFruits);
        System.out.println(joinedString);
    }
}
