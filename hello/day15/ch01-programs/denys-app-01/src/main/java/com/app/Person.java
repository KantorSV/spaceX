package com.app;

public class Person {

    private String name;
    private int age;

    public void setName(String personName) {
        name = personName;

    }

    public String getName() {
        return name;
    }

    public void setAge(int personAge) {
        age = personAge;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return "name = "+name+"; age = "+age ;
    }

}
