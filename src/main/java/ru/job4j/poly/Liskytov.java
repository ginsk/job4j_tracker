package ru.job4j.poly;

public class Liskytov {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Autobus autobus = new Autobus();
        Vehicle[] vehicles = new Vehicle[] {plane, train, autobus};
        for (Vehicle a: vehicles) {
            a.move();
        }
    }
}
