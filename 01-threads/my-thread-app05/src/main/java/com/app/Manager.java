package com.app;



public class Manager extends Thread {

    private MoneyCard moneyCard;

    public Manager(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }

    public void run(){
        System.out.println("Manager -START");
        Helper.pause(2000);
        System.out.println("Manager after pause");
        while (moneyCard.getMoney() < 5000) {

            synchronized (moneyCard) {
                try {
                    System.out.println("Manager is waiting");
                    //moneyCard.wait(50000);
                    moneyCard.wait();
                    System.out.println("Manager FINISHED waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("Manager recieved info; Money is >5000");

    }
}
