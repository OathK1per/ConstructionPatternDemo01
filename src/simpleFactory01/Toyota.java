package simpleFactory01;

public class Toyota implements Car {
    @Override
    public void run() {
        System.out.println("生产一辆丰田");
    }
}
