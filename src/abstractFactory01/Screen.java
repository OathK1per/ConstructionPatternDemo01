package abstractFactory01;

public interface Screen {
    void show();
}

class StandardScreen implements Screen {

    @Override
    public void show() {
        System.out.println("display a normal resolution");
    }
}

class LuxuryScreen implements Screen {

    @Override
    public void show() {
        System.out.println("display a high resolution");
    }
}
