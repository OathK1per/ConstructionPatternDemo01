package singleton01;

/**
 * 使用静态内部类的方式能同时实现延迟加载和保证加载速度
 * 加载静态内部类时是线程安全的，其内部属性是static final的，保证了只能被赋值一次，从了实现了线程安全
 */
public class StaticNestedClass {

    private StaticNestedClass() {
        System.out.println("加载静态内部类式");
    }

    private static class NestedClass {
        private static final StaticNestedClass load = new StaticNestedClass();
    }

    public static StaticNestedClass getInstance() {
        return NestedClass.load;
    }
}
