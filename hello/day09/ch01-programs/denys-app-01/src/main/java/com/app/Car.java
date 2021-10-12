package com.app;

public class Car {
    public int year;
    public String name;
    public int price;

    public Car() {
        System.out.println("Constructor.car()");
    }

    public Car(int carYear, String carName, int carPrice){
        year = carYear;
        name = carName;
        price = carPrice;
    }
}
