package model;

import enums.SexTypeEnum;

public class Person {

    private String name;
    private int age;
    private SexTypeEnum sex;

    public Person(){

    }

    public Person(String name, int age, SexTypeEnum sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SexTypeEnum getSex() {
        return sex;
    }

    public void setSex(SexTypeEnum sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    /*
    public String standUp() {

    }

    public String sitDown() {

    }

    public String drink() {

    }
     */

}
