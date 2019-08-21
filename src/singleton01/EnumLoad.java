package singleton01;

/**
 * 枚举法本身就实现了单例功能，但是不能延迟加载
 */
public enum EnumLoad {
    //定义此枚举元素时就创建了一个单例对象
    INSTANCE;

    //下面可以写各种属性方法，同普通Class对象
    private String str = "go home";

    public void singletonOperation() {
        System.out.println(str);
    }
}
