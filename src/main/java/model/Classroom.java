package model;

import enums.ClassroomEnum;
import helper.Helper;

import java.util.Date;

public class Classroom {

    private String id;
    private ClassroomEnum name;
    private Date date;

    public Classroom(String id, ClassroomEnum name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClassroomEnum getName() {
        return name;
    }

    public void setName(ClassroomEnum name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "model.Classroom{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
