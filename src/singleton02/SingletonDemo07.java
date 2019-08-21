package singleton02;

import java.lang.reflect.Constructor;

public class SingletonDemo07 {

    public static void main(String[] args) throws Exception {
        String path = "singleton02.AntiInstantLoad";
        Class<AntiInstantLoad> clazz = (Class<AntiInstantLoad>) Class.forName(path);

        Constructor<AntiInstantLoad> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        AntiInstantLoad instance = constructor.newInstance();
        AntiInstantLoad instance1 = constructor.newInstance();

        System.out.println(instance);
        System.out.println(instance1);
    }
}
