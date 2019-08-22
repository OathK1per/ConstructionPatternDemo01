package prototype01;

import java.io.Serializable;
import java.util.Date;

public class Student implements Cloneable, Serializable {

    private int id;
    private String name;
    private Date time;
    private ClassRoom classRoom;

    public Student clone() throws CloneNotSupportedException {
        Student student = (Student)super.clone();
        return student;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
        super();
    }
}

class ClassRoom implements Cloneable{
    private int seat;

    public ClassRoom clone() throws CloneNotSupportedException {
        return (ClassRoom) super.clone();
    }

    public ClassRoom(int seat) {
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
