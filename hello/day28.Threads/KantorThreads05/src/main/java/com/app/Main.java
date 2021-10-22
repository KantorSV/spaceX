package com.app;

public class Main {

    public static void main(String[] args) {

        MoneyCard moneyCard = new MoneyCard();

        Boss boss = new Boss(moneyCard);
        boss.start();

        Manager manager = new Manager(moneyCard);
        manager.start();

        Employee employee = new Employee(moneyCard);
        employee.start();
    }

}
