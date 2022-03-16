package model;

import java.util.List;

public class School {
    private String id;
    private String name;
    Person director;
    Person happyManager;
    List<Classroom> classroomList;
    List<Option> options;

    public School(String id, String name, Person director, Person happyManager, List<Classroom> classroomList, List<Option> options) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.happyManager = happyManager;
        this.classroomList = classroomList;
        this.options = options;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public List<Classroom> getClassroomList() {
        return classroomList;
    }

    public void setClassroomList(List<Classroom> classroomList) {
        this.classroomList = classroomList;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public Person getHappyManager() {
        return happyManager;
    }

    public void setHappyManager(Person happyManager) {
        this.happyManager = happyManager;
    }

    @Override
    public String toString() {
        return "model.School{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director=" + director +
                ", happyManager=" + happyManager +
                ", classroomList=" + classroomList +
                ", options=" + options +
                '}';
    }
}
