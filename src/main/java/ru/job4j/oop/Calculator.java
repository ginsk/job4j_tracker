package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int j) {
        return j / x;
    }

    public int sumAllOperation(int q) {
        return multiply(q) + sum(q) + divide(q) + minus(q);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int f = calculator.divide(5);
        int u = calculator.sumAllOperation(5);
        System.out.println(rsl);
        System.out.println(sum(5));
        System.out.println(minus(5));
        System.out.println(f);
        System.out.println(u);
    }
}
