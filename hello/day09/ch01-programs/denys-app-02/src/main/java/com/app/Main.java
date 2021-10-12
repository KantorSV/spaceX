package com.app;

public class Main {

    public static void main(String[] args) {
        Kantor kantor = new Kantor();
        kantor.name="Vasilii";
        System.out.println("kantor.name="+kantor.name);

        System.out.println("----------------------------");
        Sergey sergey = new Sergey();
        sergey.name="Sergii";
        sergey.age=34;
        System.out.println("sergey.name="+sergey.name+"; sergey.age="+sergey.age);

        System.out.println("-----------------------------------");

        Slavik slavik = new Slavik();
        slavik.name="Slavik";
        slavik.height=180;
        System.out.println("slavik.name="+slavik.name+"; slavik.height="+slavik.height);

        System.out.println("-----------------------------------------");

        Misha misha = new Misha();
        misha.age=8;
        misha.name="Mihail";
        misha.patronemic="Sergiovich";
        System.out.println("m.name="+misha.name+"; m.age="+misha.age+"; m.patronemic="+misha.patronemic);



    }

}
