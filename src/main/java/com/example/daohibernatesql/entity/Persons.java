package com.example.daohibernatesql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name = "persons", schema = "netology")
@Entity
public class Persons {

    @EmbeddedId
    private Contact contact;

    @Column(name = "phone_number", unique = true, length = 30)
    private String phoneNumber;

    @Column(name = "city_of_living", length = 255)
    private String cityOfLiving;

    public Persons() {
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "contact=" + contact +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cityOfLiving='" + cityOfLiving + '\'' +
                '}';
    }
}
