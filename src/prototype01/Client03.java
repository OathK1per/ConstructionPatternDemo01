package prototype01;

import java.io.*;
import java.util.Date;

/**
 * 通过使用序列化和反序列化得到新对象，来实现深复制
 */
public class Client03 {

    public static void main(String[] args) throws Exception {
        Student student = new Student();
        Date date = new Date();
        student.setTime(date);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(bos));
        oos.writeObject(student);
        oos.flush();

        byte[] bytes = bos.toByteArray();
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(bytes)));
        Object object = ois.readObject();
        Student student2 = (Student)object;

        //primitive type和String不用考虑深复制
        date.setTime(123123123123L);

        System.out.println(student.getTime());
        System.out.println(student2.getTime());
    }
}
