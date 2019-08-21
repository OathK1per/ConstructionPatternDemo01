package singleton01;

import java.io.Serializable;

/**
 * 饿汉式，static属性立即加载，也就不会造成调用时发生错误的可能，自身就实现了并发访问
 */
public class InstantLoad implements Serializable {

    private static InstantLoad load = new InstantLoad();

    private InstantLoad() {
        System.out.println("加载饿汉式");
    }

    public static InstantLoad getInstance() {
        return load;
    }
}
