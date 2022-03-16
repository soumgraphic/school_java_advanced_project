package model;

import enums.OptionEnum;

import java.util.List;

public class Option {
    private String id;
    private OptionEnum name;
    List<Module> modules;

    public Option(String id, OptionEnum name, List<Module> modules) {
        this.id = id;
        this.name = name;
        this.modules = modules;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OptionEnum getName() {
        return name;
    }

    public void setName(OptionEnum name) {
        this.name = name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "model.Option{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", modules=" + modules +
                '}';
    }
}
