package abstractFactory01;

public interface LaptopFactory {

    TouchPad createTouchPad();
    KeyBoard createKeyBoard();
    Screen createScreen();
}
