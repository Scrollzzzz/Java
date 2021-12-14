package com.company.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[]args)
    {
        String order;
        Scanner sc=new Scanner(System.in);
        System.out.print("Введите ваш заказ: ");
        order=sc.next();
        System.out.println("Как вы хотите оплатить заказ: \nВведите 1, чтобы оплатить заказ через кредитную карту \nВведите 2, чтобы оплатить заказ через интернет-кошелек");
        int temp;
        temp=sc.nextInt();
        switch (temp) {
            case 1 -> {
                CreditCard creditCard = new CreditCard();
                creditCard.pay();
            }
            case 2 -> {
                OnlineWallet onlineWallet = new OnlineWallet();
                onlineWallet.pay();
            }
            default -> System.out.print("Ошибка ввода");
        }
        System.out.println("Вы успешно приобрели "+ order+". Спасибо за покупку");
    }
}
