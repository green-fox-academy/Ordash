package com.greenfox.bankofsimba.models;

public class BankAccount {
    private String name;
    private String animalType;
    private Double balance;
    private Boolean king;
    private String goodOrBad;


    public BankAccount(String name, String animalType, Double balance, String goodOrBad) {
        this.king = false;
        this.name = name;
        this.animalType = animalType;
        this.balance = balance;
        this.goodOrBad = goodOrBad;
    }

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public Boolean isKing() {
        return king;
    }

    public void setKing(Boolean king) {
        this.king = king;
    }

    public String getName() {
        return name;
    }


    public String getAnimalType() {
        return animalType;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
