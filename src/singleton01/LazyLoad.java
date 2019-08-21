package singleton01;

/**
 * 懒汉式，当调用getInstance()方法时才给static属性赋值，可以实现延迟加载，可能出现并发问题，需要标注synchronized
 */
public class LazyLoad {
    private static LazyLoad load;

    private LazyLoad() {
        System.out.println("加载懒汉式");
    }

    public static synchronized LazyLoad getInstance() {
        if (load == null) {
            load = new LazyLoad();
        }
        return load;
    }
}
