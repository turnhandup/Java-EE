package com.mycompany.app;

/**
 * Created by PANNA on 08.03.2017.
 */
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="teachers")
public class Teacher {
    public Teacher(){}
    @Id
    @GeneratedValue
    private int teacherId;

    @Column(name="firstname")
    private String firstname;

    @Column(name="lastname")
    private String lastname;

    @Column(name="birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name="cell_phone")
    private String cellphone;

    @OneToOne
    @JoinColumn(name="address_fk")
    private Address address;

    @OneToMany
    @JoinColumn(name="lectures_fk")
    private List<Lecture> lectures;
    @ManyToMany(mappedBy = "isInStudents")
    private List<Student> students;


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

//Getters and Setters
}