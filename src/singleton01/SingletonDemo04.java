package singleton01;

import java.io.*;

/**
 * 使用反序列化破解简单的单例模式
 */
public class SingletonDemo04 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(bos));

        InstantLoad instance = InstantLoad.getInstance();
        oos.writeObject(instance);
        oos.flush();

        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(bis));
        InstantLoad object = (InstantLoad) ois.readObject();
        System.out.println(instance);
        System.out.println(object);
    }
}
