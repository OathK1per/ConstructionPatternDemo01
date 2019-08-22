package simpleFactory01;

/**
 * 简单工厂，一个工厂类实现所有实体类的创建功能，方法为静态方法
 */
public class Client01 {

    public static void main(String[] args) {
        Car corolla = CarFactory01.createToyota();
        Car civic = CarFactory01.createHonda();

        corolla.run();
        civic.run();
    }
}
