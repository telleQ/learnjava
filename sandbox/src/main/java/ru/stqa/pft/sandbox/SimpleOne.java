package ru.stqa.pft.sandbox;

class SimpleOne {
    public static void main(String args[]) {
        System.out.println("Hello Java");

        Squire s = new Squire(5);
        System.out.println("Squire area with side " + s.l + " = " + s.area());

        Restangle r = new Restangle(4, 6);
        System.out.println("Restangle area with side " + r.a + " and " + r.b + " = " + r.area());
    }
}
