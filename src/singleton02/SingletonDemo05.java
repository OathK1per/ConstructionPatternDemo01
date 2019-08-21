package singleton02;

import java.lang.reflect.Constructor;

public class SingletonDemo05 {

    public static void main(String[] args) throws Exception {
        String path = "singleton02.AntiLazyLoad";
        Class<AntiLazyLoad> clazz = (Class<AntiLazyLoad>) Class.forName(path);

        Constructor<AntiLazyLoad> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        AntiLazyLoad instance = constructor.newInstance();
        AntiLazyLoad instance1 = constructor.newInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }
}
