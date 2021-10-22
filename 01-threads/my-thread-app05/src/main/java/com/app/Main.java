package com.app;

public class Main {

    public static void main(String[] args) {
        MoneyCard moneyCard = new MoneyCard();
        //moneyCard.setMoney(1000);

        Manager manager = new Manager(moneyCard);
        manager.start();


        Boss boss = new Boss(moneyCard);
        boss.start();


        Employee employee = new Employee(moneyCard);
        employee.start();

    }

}
