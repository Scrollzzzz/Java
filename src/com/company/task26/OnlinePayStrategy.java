package com.company.task26;

import java.util.Scanner;

public class OnlinePayStrategy implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Для оплаты с помощью онлайн-кошелька введите номер своего кошелька, а после - код, который вам будет выслан ");
        Scanner sc=new Scanner(System.in);
        sc.next();
        sc.next();
        System.out.println("Оплата успешно проведена");
    }
}
