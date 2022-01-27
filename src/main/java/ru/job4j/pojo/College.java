package ru.job4j.pojo;

import java.util.Date;

public class College  {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFoolName("Саша Грей");
        student.setDate("14.02.2020");
        student.setGroup("cleanLove");
        System.out.println(student.getFoolName() +  " преподаст " + student.getDate() + " урок "
                + student.getGroup());
    }
}
