package singleton02;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 防止反射和反序列化的方式破解单例模式(未能成功防止反射操作)
 */
public class AntiLazyLoad implements Serializable {

    private static AntiLazyLoad load;

    private AntiLazyLoad() throws Exception {
        if (load != null) {
            throw new Exception("该对象已经创建");
        }
        System.out.println("加载懒汉式");
    }

    public static synchronized AntiLazyLoad getInstance() throws Exception {
        if (load == null) {
            load = new AntiLazyLoad();
        }
        return load;
    }

    //反序列化时会自动调用此方法
    private Object readResolve() throws ObjectStreamException {
        return load;
    }
}
