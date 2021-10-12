package com.app;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.setName("BMW");
        bmw.setSeries("7");
        bmw.setCapacityEngine(3.2f);
        bmw.setMaxSpeed(280);
        bmw.setPrice(68200);
        System.out.println(bmw);

        System.out.println("________________________________");

        AUDI audi = new AUDI();
        audi.setName("AUDI");
        audi.setSeries("RX-6");
        audi.setCapacityEngine(4.8f);
        audi.setMaxSpeed(300);
        audi.setPrice(128600);
        System.out.println(audi);

        System.out.println("________________________________");

        Porsche porsche = new Porsche();
        porsche.setName("PORSCHE");
        porsche.setSeries("GT-3");
        porsche.setCapacityEngine(6.5f);
        porsche.setMaxSpeed(360);
        porsche.setPrice(248800);
        System.out.println(porsche);
    }
}
