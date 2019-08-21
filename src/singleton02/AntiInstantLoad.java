package singleton02;

public class AntiInstantLoad {

    private static AntiInstantLoad load = new AntiInstantLoad();

    private AntiInstantLoad() {
        System.out.println("加载饿汉式");
    }

    public static AntiInstantLoad getInstance() {
        return load;
    }
}
