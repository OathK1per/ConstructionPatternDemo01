package abstractFactory01;

public class StandardLaptopFactory implements LaptopFactory {
    @Override
    public TouchPad createTouchPad() {
        return new StandardTouchPad();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new StandardKeyBoard();
    }

    @Override
    public Screen createScreen() {
        return new StandardScreen();
    }
}
