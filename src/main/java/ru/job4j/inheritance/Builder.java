package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String brick;

    public Builder(String name, String surname, String education, String birthday, String glass, String brick) {
        super(name, surname, education, birthday, glass);
        this.brick = brick;
    }
}
