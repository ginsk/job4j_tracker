package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String drill;

    public Dentist(String name, String surname, String education, String birthday, String resept, String drill) {
        super(name, surname, education, birthday, resept);
        this.drill = drill;
    }
}
