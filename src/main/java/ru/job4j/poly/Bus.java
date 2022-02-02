package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String trip() {
        return null;
    }

    @Override
    public int passenger(int ticket) {
        return 0;
    }

    @Override
    public int cost(int gallon) {
        int count = 7;
        int price = count * gallon;
        return price;
    }
}
