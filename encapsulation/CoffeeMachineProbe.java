package com.avecoder.javafoundations.encapsulation;

public class CoffeeMachineProbe {
    private String coffeeName;
    private double money;
    private double price = 7.00;


   public void makeCoffee() {
        if(getCoffeeName() == "espresso" && getMoney() >= price) {
            double change = price - money;
            System.out.println("Your coffee" + getCoffeeName() + " and " + change + "change");
        } else {
            System.out.println("Not enough money, please add more");
        }
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
