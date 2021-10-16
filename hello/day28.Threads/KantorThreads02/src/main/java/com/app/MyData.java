package com.app;

public class MyData {

    int value;
    public  synchronized void increment(){
        value++;
    }

    public  synchronized void decrement(){
        value--;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "value=" + value +
                '}';
    }
}

