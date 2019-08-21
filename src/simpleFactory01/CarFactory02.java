package simpleFactory01;

public class CarFactory02 {

    public static Car createCar(String carName) {
        if (carName.equals("Honda")) {
            return new Honda();
        } else if (carName.equals("Toyota")) {
            return new Toyota();
        } else {
            return null;
        }
    }
}
