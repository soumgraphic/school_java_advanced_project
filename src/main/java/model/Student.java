package model;

import enums.DegreeTypeEnum;

public class Student extends Person {

    private String id;
    private DegreeTypeEnum degree;
    private Classroom classroom;
    private School school;
    private Option option;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DegreeTypeEnum getDegree() {
        return degree;
    }

    public void setDegree(DegreeTypeEnum degree) {
        this.degree = degree;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                "person{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", sex=" + super.getSex() +
                '}' +
                ", degree=" + degree +
                ", classroom=" + classroom +
                ", school=" + school +
                ", option=" + option +
                '}';
    }
}
