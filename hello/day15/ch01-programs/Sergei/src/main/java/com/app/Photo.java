package com.app;

public class Photo {
    private String name;
    private float weight;
    private int data;
    private String urlAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getUrlAddress() {
        return urlAddress;
    }

    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    @Override
    public String toString() {
        return "Photo name = " + name + "\n\tweight = " + weight + " Mb" + "\n\tdata = " + data + ".07.2022" + "\n\turlAddress = " + urlAddress;
    }
}
