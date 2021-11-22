package com.solvd.autoservice;

import javax.xml.bind.annotation.XmlElement;

public class Employee {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    @XmlElement
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @XmlElement
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
