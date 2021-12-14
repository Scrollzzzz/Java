package com.company.task19;

public class RightTriangle {

    private int a, b, c;

    public RightTriangle(int a, int b, int c) throws InvalidSidesException {
        if (!isSidesValid(a, b, c))
            throw new InvalidSidesException("Invalid sides");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    boolean isSidesValid(int a, int b, int c) {
        return a + b + c == 180 && (a == 90 && b < 90 && c < 90 || b == 90 && a < 90 && c < 90 || c == 90 && a < 90 && b < 90);
    }
}
