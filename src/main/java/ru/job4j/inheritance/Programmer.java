package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String bed;

    public Programmer(String name, String surname, String education, String birthday, String glass, String bed) {
        super(name, surname, education, birthday, glass);
        this.bed = bed;
    }
 }
