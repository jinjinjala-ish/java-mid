package lang.object.poly;

public class objectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound();   obj.move();는 컴파일 오류 발생  Object는 sound()와 move()를 가지고 있지 않으니까

        //다운캐스팅
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
