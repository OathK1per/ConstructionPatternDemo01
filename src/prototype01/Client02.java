package prototype01;

import java.util.Date;

/**
 * 通过更改clone方法来实现深复制
 */
public class Client02 {


    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher();
        Date date = new Date();
        ClassRoom classRoom = new ClassRoom(40);
        teacher.setId(1);
        teacher.setTime(date);
        teacher.setClassRoom(classRoom);

        Teacher teacher2 = teacher.clone();

        //primitive type和String不用考虑深复制
        date.setTime(123123123123L);
        classRoom.setSeat(50);

        System.out.println(teacher.getTime());
        System.out.println(teacher2.getTime());
        System.out.println(teacher.getClassRoom().getSeat());
        System.out.println(teacher2.getClassRoom().getSeat());
    }
}
