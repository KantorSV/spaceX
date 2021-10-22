package com.app;

public class Employee extends Thread{

    private MoneyCard moneyCard;

    public Employee(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }

    public void run(){

        System.out.println("\t\tEMPLOYEE START");
        Helper.pause(1000);
        System.out.println("\t\tEMPLOYEE after pause");

        while (moneyCard.getMoney() < 5000){
            synchronized (moneyCard){
                try {
                    System.out.println("\t\tEMPLOYEE wait");
                    moneyCard.wait();
                    System.out.println("\t\tEMPLOYEE after wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\t\tEMPLOYEE go to Club");
    }
}
