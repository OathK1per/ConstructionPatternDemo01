package factoryMethod01;

public class iPhoneXFactory implements iPhoneFactory {
    @Override
    public iPhoneX createIPhone() {
        System.out.println("created the iPhoneX");
        return new iPhoneX();
    }
}
