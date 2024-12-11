package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();
        Object obj1 = new Car();
        Car car1 = (Car)obj1;

        action(dog);
        action(car);
    }

    /*
    Object 타입 참조변수로 모든 타입 객체를 받을 수 있음.
    받은 객체의 메서드 중 Object에 정의되어있지 않은 메서드는 사용할 수 없다.
    Object 타입 참조변수를 실제 객체에 맞게 다운캐스팅 한 뒤에 객체 타입에 정의된 메서드를 사용할 수 있다.
     */
    private static void action(Object object) {
//        object.move();
//        object.sound();

        // 타입 확인 후 참이면 dog이라는 이름으로 Dog 타입 참조변수 만들어서 다운캐스팅.
        if (object instanceof Dog dog) {
            dog.sound();
        }
        if (object instanceof Car car) {
            car.move();
        }
    }
}
