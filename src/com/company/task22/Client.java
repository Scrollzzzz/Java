package com.company.task22;

public class Client {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Chair victorian = chairFactory.createChair(ChairType.VictorianChair);
        Chair multifunctional = chairFactory.createChair(ChairType.MultifunctionalChair);
        Chair magic = chairFactory.createChair(ChairType.MagicChair);

        Client client = new Client();
        client.sit(victorian);
        client.sit(multifunctional);
        client.sit(magic);
    }

    public void sit (Chair chair){
        System.out.println("You are sitting on the " + chair.type() + " chair");
    }
}
