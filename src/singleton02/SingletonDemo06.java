package singleton02;

import java.io.*;

public class SingletonDemo06 {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(bos));

        AntiLazyLoad instance = AntiLazyLoad.getInstance();
        oos.writeObject(instance);
        oos.flush();

        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(bis));
        AntiLazyLoad object = (AntiLazyLoad) ois.readObject();
        System.out.println(instance);
        System.out.println(object);
    }
}
