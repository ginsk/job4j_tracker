package ru.job4j.pojo;

import java.util.Date;

public class College extends Student {
    public static void main(String[] args) {
        College college = new College();
        college.setFoolName("Саша Грей");
        college.setDate("14.02.2020");
        college.setGroup("cleanLove");
        System.out.println(college.getFoolName() +  " преподаст " + college.getDate() + " урок "
                + college.getGroup());
    }
}
