package com.app;

public class MainEqualsHashCode {

    public static void main(String[] args) {
        System.out.println("----------------equals-------------------");
        Person p1  =new Person();
        Person p2 = new Person();

        //p1=p2;

        boolean equal = p1.equals(p2);
        System.out.println("p1.equals(p2)="+equal);

        boolean x = p1==p2;
        System.out.println("p1==p2-->"+x);


        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean res = obj1.equals(obj2);
        System.out.println("obj1.equals(obj2)="+res);

        System.out.println("----------------hashCode-------------------");
        Person denys = new Person();
        int denysHashCode = denys.hashCode();
        System.out.println("denysHashCode="+denysHashCode);
        denys.name="Denys";
        denysHashCode = denys.hashCode();
        System.out.println("denysHashCode="+denysHashCode);

        Person sergii = new Person();
        int sergiiHashCode = sergii.hashCode();
        System.out.println("sergiiHashCode="+sergiiHashCode);

        denys = sergii;
        denysHashCode = denys.hashCode();
        System.out.println("denysHashCode="+denysHashCode);

    }
}
