package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student billi = new Student();
        billi.setFirstname("Billi");
        billi.setLastname("Smith");
        billi.setGroup("A");
        billi.setEntryDate(new Date());

        System.out.println("Student firstname: " + billi.getFirstname()
            + ", Studend lastname: " + billi.getLastname()
            + ", Student group: " + billi.getGroup()
            + ", Student entry date: " + billi.getEntryDate());
    }
}
