package ru.job4j.poly;

public interface Transport {

    void trip();

    void passenger(int ticket);

    int cost(int gallon);
}
