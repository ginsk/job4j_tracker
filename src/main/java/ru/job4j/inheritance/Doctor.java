package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String resept ;

    public Doctor (String name, String surname, String education, String birthday, String resept) {
        super(name, surname, education, birthday);
        this.resept = resept;
    }

}
