package com.mycompany.app;

import org.springframework.cache.annotation.CachePut;

import javax.persistence.*;

/**
 * Created by PANNA on 09.03.2017.
 */
@Embeddable
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="street1")
    private String street1;
    @Column(name="street2")
    private String street2;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zipcode")
    private String zipcode;
    @Column(name="country")
    private String country;
    @OneToOne(mappedBy = "address")
// Constructors, getters, setters

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
