package abstractFactory01;

public interface TouchPad {

    void move();
}

class StandardTouchPad implements TouchPad {

    @Override
    public void move() {
        System.out.println("sometimes have a lag");
    }
}

class LuxuryTouchPad implements TouchPad {

    @Override
    public void move() {
        System.out.println("have an accurate movement");
    }
}
