package com.app;

public class CarMain {


    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name="bmw";
        car1.price=40;
        car1.year=2010;

        System.out.println("name="+car1.name+"; price="+car1.price+"; year="+car1.year);
        System.out.println("---------------------------------------------------------");

        Car car2 = new Car(2021, "Mercedes", 50);
        System.out.println("name="+car2.name+"; price="+car2.price+"; year="+car2.year);

    }
}
