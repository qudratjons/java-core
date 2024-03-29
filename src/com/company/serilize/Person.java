package com.company.serilize;

import java.io.Serializable;

public class Person implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
