package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String resept;
    private String pacient;

    public Doctor(String name, String surname, String education, String birthday, String resept) {
        super(name, surname, education, birthday);
        this.resept = resept;
    }

    public Diagnosis heal(Pacient pacient) {
       Diagnosis diag = new Diagnosis();
        return diag;
    }

}
