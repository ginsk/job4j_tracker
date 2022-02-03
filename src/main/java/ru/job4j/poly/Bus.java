package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void trip() {

    }

    @Override
    public void passenger(int ticket) {

    }

    @Override
    public int cost(int gallon) {
        int count = 7;
        int price = count * gallon;
        return price;
    }
}
