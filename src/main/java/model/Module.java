package model;

public class Module {
    private String id;
    private String name;
    private Person professor;

    public Module(String id, String name, Person professor) {
        this.id = id;
        this.name = name;
        this.professor = professor;
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

    public Person getProfessor() {
        return professor;
    }

    public void setProfessor(Person professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "model.Module{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", professor=" + professor +
                '}';
    }
}
