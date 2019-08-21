package simpleFactory01;

public class Honda implements Car {
    @Override
    public void run() {
        System.out.println("生产一辆本田");
    }
}
