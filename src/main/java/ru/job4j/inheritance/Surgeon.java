package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String blade;

    public Surgeon(String name, String surname, String education, String birthday, String resept, String blade) {
        super(name, surname, education, birthday, resept);
        this.blade = blade;
    }
}
