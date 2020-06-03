package com.application;

import java.util.GregorianCalendar;

public class Mentor<User> extends Users {

private String course;

    public Mentor(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
        super(nameAndSurname, email, phoneNumber, dateOfBirth);
    }

}
