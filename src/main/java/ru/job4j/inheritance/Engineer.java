package ru.job4j.inheritance;

public class Engineer extends Profession {

    private String glass;

    public Engineer(String name, String surname, String education, String birthday, String glass) {
        super(name, surname, education, birthday);
        this.glass = glass;
    }
 }
