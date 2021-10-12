package com.app;

public class AUDI {
    private String name;
    private String series;
    private float capacityEngine;
    private int maxSpeed;
    private int price;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public float getCapacity() {
        return capacityEngine;
    }

    public void setCapacityEngine(float capacity) {
        this.capacityEngine = capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name + "\nseries = " + series + "\ncapacityEngine = " + capacityEngine + "\nmaxSpeed = " + maxSpeed + " km/h" + "\nprice = " + price + " $";
    }
}
