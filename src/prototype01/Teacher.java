package prototype01;

import java.util.Date;

public class Teacher implements Cloneable {

    private int id;
    private String name;
    private Date time;
    private ClassRoom classRoom;

    /**
     * 将具体的属性也进行一次克隆，赋给clone出的对象的属性上，注意不要赋给原对象的属性上了
     * @return
     * @throws CloneNotSupportedException
     */
    public Teacher clone() throws CloneNotSupportedException {
        Teacher teacher = (Teacher)super.clone();
        teacher.classRoom = this.classRoom.clone();
        teacher.time = (Date) this.time.clone();
        return teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }
}
