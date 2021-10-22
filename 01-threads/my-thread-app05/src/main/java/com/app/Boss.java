package com.app;


public class Boss extends Thread {
    private MoneyCard moneyCard;

    public Boss(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }

    public void run(){
        System.out.println("Boss START");
        Helper.pause(3000);
        System.out.println("Boss after pause");
        System.out.println("Sending 7000 to money card");
        moneyCard.setMoney(7000);
        synchronized (moneyCard) {
            Helper.pause(15000);
            System.out.println("Boss make notify");
            //moneyCard.notify();
            moneyCard.notifyAll();
        }

        System.out.println("Boss finished");
    }
}
