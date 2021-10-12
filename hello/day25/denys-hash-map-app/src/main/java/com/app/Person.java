package com.app;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int hashCode(){
        int nameHashCode = 0;
        if(name!=null){
            nameHashCode = name.hashCode();
            //nameHashCode = name.length();
        }
        return age + nameHashCode;
    }

    public boolean equals(Object other){
        if(other==null){
            return false;
        }
        if(other==this){
            return true;
        }
        if(other instanceof Person){
            Person person = (Person)other;
            if(person.getAge()!=age){
                return false;
            }
            if(name==null && person.getName()==null){
                return true;
            }
            if(name!=null){
                return name.equals(person.getName());
            }
            return person.getName().equals(name);
        }

        return false;
    }


}
