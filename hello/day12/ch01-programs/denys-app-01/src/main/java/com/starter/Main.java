package com.starter;

import com.app.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.model = "LG";
        System.out.println("phone.model="+phone.model);
        //phone.price=10;
        phone.sendSms();
        //phone.year=2021;
        //phone.seria="qqqq";

    }

}
