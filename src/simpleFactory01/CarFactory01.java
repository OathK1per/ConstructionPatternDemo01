package simpleFactory01;

public class CarFactory01 {

    public static Car createHonda() {
        return new Honda();
    }

    public static Car createToyota() {
        return new Toyota();
    }
}
