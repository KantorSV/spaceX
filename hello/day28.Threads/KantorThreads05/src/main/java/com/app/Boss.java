package com.app;

public class Boss extends Thread {

    private MoneyCard moneyCard;

    public Boss(MoneyCard moneyCard) {
        this.moneyCard = moneyCard;
    }


    public void run() {

        System.out.println("BOSS START");
        Helper.pause(3000);
        System.out.println("BOSS after pause");
        System.out.println("Sending 7000 to money card");
        moneyCard.setMoney(7000);
        synchronized (moneyCard){
            Helper.pause(10000);
            System.out.println("BOSS make notify");
            moneyCard.notifyAll();
        }
        System.out.println("BOSS FINISHED");

    }
}
