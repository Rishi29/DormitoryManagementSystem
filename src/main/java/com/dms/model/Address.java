package com.dms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Rishi on 7/29/2016.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;
    private String street;
    private String postBox;
    private String city;
    private String state;
    private String country;

    public Address() {
    }

    public Address(String street, String postBox, String city, String state, String country) {
        this.street = street;
        this.postBox = postBox;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostBox() {
        return postBox;
    }

    public void setPostBox(String postBox) {
        this.postBox = postBox;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
