package com.app;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        //user.age=10;
        //user.name="MyUser";

        user.setName("MyUser");
        String name = user.getName();

        //System.out.println("user.name="+user.name);
        //System.out.println("user.age="+user.age);

        System.out.println("name="+name);
        System.out.println("_________________________________");

        user.setAge(34);
        int age = user.getAge();

        System.out.println("age="+age);
        System.out.println("----------------------------------");

        Person person = new Person();
        System.out.println("Person="+person);
        System.out.println("Person="+person.toString());
        System.out.println("---------------------------------------");
        Person person2 = new Person();
        System.out.println("Person2="+person2);
        System.out.println("Person2="+person2.toString());
        System.out.println("----------------------------------------");

        Person p1 = new Person();
        p1.setAge(55);
       // p1.setName("Denys");
        age = p1.getAge();


        Person p2 = new Person();
        p2.setName("MU");

        name = p2.getName();
        System.out.println("personName="+p1);
        System.out.println("personAge="+p2);
    }

}
