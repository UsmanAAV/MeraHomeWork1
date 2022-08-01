package com.orioninc.homework.homework3;

public class Person {
    String firstName;
    String lastName;

    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
