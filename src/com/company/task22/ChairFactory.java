package com.company.task22;

public class ChairFactory {
    public Chair createChair(ChairType type) {
        Chair chair = null;

        switch (type) {
            case VictorianChair:
                chair = new VictorianChair();
                break;
            case MultifunctionalChair:
                chair = new MultifunctionalChair();
                break;
            case MagicChair:
                chair = new MagicChair();
                break;
        }

        return chair;
    }
}
