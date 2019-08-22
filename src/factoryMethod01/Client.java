package factoryMethod01;

/**
 * 工厂方法，每个实体类都有一个对应的工厂
 */
public class Client {

    public static void main(String[] args) {
        iPhoneFactory factory = new iPhone8Factory();
        iPhone fans = factory.createIPhone();
        fans.run();
    }
}
