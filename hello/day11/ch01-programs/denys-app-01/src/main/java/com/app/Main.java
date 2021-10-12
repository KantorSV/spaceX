package com.app;

public class Main {

    public static void main(String[] args) {
        SonyPhone sonyPhone = new SonyPhone();
        sonyPhone.sendSms();
        System.out.println("----------------------------");

        PhilipsPhone philipsPhone = new PhilipsPhone();
        philipsPhone.sendSms();
        System.out.println("----------------------------");

        SamsungPhone samsungPhone = new SamsungPhone();
        samsungPhone.sendSms();
        System.out.println("#############################");

        Phone phone = new SamsungPhone();
        phone.sendSms();
    }

}
