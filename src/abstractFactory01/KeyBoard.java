package abstractFactory01;

public interface KeyBoard {

    void press();
}

class StandardKeyBoard implements KeyBoard {

    @Override
    public void press() {
        System.out.println("press it without feedback");
    }
}

class LuxuryKeyBoard implements KeyBoard {

    @Override
    public void press() {
        System.out.println("press it like mechanical keyboard");
    }
}
