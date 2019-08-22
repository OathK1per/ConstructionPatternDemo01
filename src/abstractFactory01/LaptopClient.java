package abstractFactory01;

/**
 * 抽象工厂，对单个产品无效，帮助创建一个产品族
 */
public class LaptopClient {

    public static void main(String[] args) {
        StandardLaptopFactory factory = new StandardLaptopFactory();
        TouchPad touchPad = factory.createTouchPad();
        KeyBoard keyBoard = factory.createKeyBoard();
        Screen screen = factory.createScreen();

        touchPad.move();
        keyBoard.press();
        screen.show();
    }
}
