package singleton01;

import java.lang.reflect.Constructor;

public class SingletonDemo03 {

    public static void main(String[] args) throws Exception {
        String path = "singleton01.LazyLoad";
        Class<LazyLoad> clazz = (Class<LazyLoad>) Class.forName(path);

        Constructor<LazyLoad> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyLoad instance = constructor.newInstance();
        LazyLoad instance1 = constructor.newInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }
}
