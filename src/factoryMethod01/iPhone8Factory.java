package factoryMethod01;

public class iPhone8Factory implements iPhoneFactory {
    @Override
    public iPhone8 createIPhone() {
        System.out.println("created the iPhone8");
        return new iPhone8();
    }
}
