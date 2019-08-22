package prototype01;

import java.util.Date;

/**
 * 原型模式：通过实现Cloneable接口和实现clone()方法来更加快速有效的完成克隆过程
 * 直接使用实现浅复制，仍指向相同的对象
 */
public class Client01 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        Date date = new Date();
        String stu = "student1";
        student.setId(1);
        student.setName(stu);
        student.setTime(date);

        Student student2 = student.clone();

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student2.getName());
        System.out.println(student2.getTime());

        //primitive type和String不用考虑深复制
        stu.toUpperCase();
        date.setTime(123123123123L);

        System.out.println(student.getName());
        System.out.println(student2.getName());
        System.out.println(student.getTime());
        System.out.println(student2.getTime());
    }
}
