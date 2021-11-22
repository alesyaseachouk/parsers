package com.solvd.autoservice;

import javax.xml.bind.annotation.XmlElement;

public class Client {

    private String firstName;
    private String lastName;
    private String carBrand;

    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", carBrand='" + carBrand + '\'' +
                '}';
    }

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

    public String getCarBrand() {
        return carBrand;
    }

    @XmlElement
    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
