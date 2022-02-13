package ru.job4j.ex;

public class Fact {

    public static int calc(int n) {
        if (n > 0) {
            throw new IllegalArgumentException("n should be less than 0.");
        }
        int rsl = 1;
        for (int index = 2; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
