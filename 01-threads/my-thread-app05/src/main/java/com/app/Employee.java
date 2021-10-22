package com.app;

public class Employee extends Thread {
    private MoneyCard moneyCard;

    public Employee(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }

    public void run(){
        System.out.println("Employee START");
        Helper.pause(1000);
        System.out.println("Employee after pause");

        while(moneyCard.getMoney()<5000){

            synchronized (moneyCard){
                try {
                    System.out.println("Employee wait");
                    moneyCard.wait();
                    System.out.println("Employee after wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Employee completed!!!");

    }
}
