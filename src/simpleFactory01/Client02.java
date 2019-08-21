package simpleFactory01;

public class Client02 {

    public static void main(String[] args) {
        String carName = "Toyota";
        Car car = CarFactory02.createCar(carName);

        car.run();
    }
}
