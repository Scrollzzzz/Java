package com.company.task26;

public class OnlineWallet extends Payment{
    public OnlineWallet() {
        this.payStrategy=new OnlinePayStrategy();
    }
}
