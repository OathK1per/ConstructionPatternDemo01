package simpleFactory01;

public class Client01 {

    public static void main(String[] args) {
        Car corolla = CarFactory01.createToyota();
        Car civic = CarFactory01.createHonda();

        corolla.run();
        civic.run();
    }
}
