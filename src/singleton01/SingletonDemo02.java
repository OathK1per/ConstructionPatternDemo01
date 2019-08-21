package singleton01;

import java.lang.reflect.Constructor;

/**
 * 使用反射破解简单的单例模式
 */
public class SingletonDemo02 {

    public static void main(String[] args) throws Exception {
        String path = "singleton01.InstantLoad";
        Class<InstantLoad> clazz = (Class<InstantLoad>) Class.forName(path);

        //饿汉式在初始化构造器时就会输出文字
        Constructor<InstantLoad> constructor = clazz.getDeclaredConstructor();
        //设置accessible才能获取私密构造器
        constructor.setAccessible(true);
        InstantLoad instance = constructor.newInstance();
        InstantLoad instance1 = constructor.newInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }
}
