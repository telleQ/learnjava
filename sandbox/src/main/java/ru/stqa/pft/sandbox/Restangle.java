package ru.stqa.pft.sandbox;

public class Restangle {
    public double a;
    public double b;

    public Restangle (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}