package com.mycompany.app;

/**
 * Created by PANNA on 09.03.2017.
 */
import javax.persistence.*;

@Entity
@Table(name="Lectures")
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Basic(fetch=FetchType.EAGER)
    @Column(name="name")
    private String name;
    @Column(name="credits", nullable=false)
    private double credits;
//Getters and settings

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
