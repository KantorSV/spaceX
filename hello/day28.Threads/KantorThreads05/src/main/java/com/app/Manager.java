package com.app;

public class Manager extends Thread {

    private MoneyCard moneyCard;


    public Manager(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }

    public void run() {

        System.out.println("\tMANAGER START");
        Helper.pause(2000);
        System.out.println("\tMANAGER after pause");
        while (moneyCard.getMoney() < 5000) {

            synchronized (moneyCard) {
                try {
                    System.out.println("\tMANAGER is waiting");
                    moneyCard.wait();
                    System.out.println("\tMANAGER finished waiting");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("\tI go to Bar");

    }
}
