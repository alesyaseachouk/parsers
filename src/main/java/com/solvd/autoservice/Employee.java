package com.solvd.autoservice;

import java.time.LocalDateTime;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private LocalDateTime dateOfBirth;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDob() {
        return dateOfBirth;
    }

    public void setDob(LocalDateTime dob) {
        this.dateOfBirth = dob;
    }

}
