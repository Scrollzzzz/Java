package com.company.task26;

public class CreditCard extends Payment{
    public CreditCard() {
        this.payStrategy=new CreditPayStrategy();
    }
}