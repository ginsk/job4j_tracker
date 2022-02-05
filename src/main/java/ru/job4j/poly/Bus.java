package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void trip() {
        System.out.println("Один плацкарт до Жмеринки!");
    }

    @Override
    public void passenger(int ticket) {
        System.out.println(ticket);
    }

    @Override
    public int cost(int gallon) {
        int count = 7;
        int price = count * gallon;
        return price;
    }
}
