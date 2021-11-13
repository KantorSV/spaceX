package com.app;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("вызываю конструктор");
    }

    public Person(int age, String name) {
        //this();
        System.out.println("вызываю конструктор 2");
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void finalize() {
        System.out.println("вызываю деструктор; name=" + name + "; age=" + age);
    }

}
