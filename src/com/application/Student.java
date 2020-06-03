package com.application;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Student<User> extends Users {
 private String course;
 private int ResultTest;

    public Student(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
        super(nameAndSurname, email, phoneNumber, dateOfBirth);
    }
    public String getCourse() {
        return course;
    }
    public int getResultTest() {
        return ResultTest;
    }


}
