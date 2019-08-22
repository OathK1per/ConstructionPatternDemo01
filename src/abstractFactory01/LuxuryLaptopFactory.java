package abstractFactory01;

public class LuxuryLaptopFactory implements LaptopFactory {
    @Override
    public TouchPad createTouchPad() {
        return new LuxuryTouchPad();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new LuxuryKeyBoard();
    }

    @Override
    public Screen createScreen() {
        return new LuxuryScreen();
    }
}
