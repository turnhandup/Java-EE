package com.mycompany.app;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by PANNA on 01.03.2017.
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue
    private int studentId;
    @Column(name="pib")
    private String pib;
    @Column(name="course")
    private int course;
    @ManyToMany
    @JoinTable(name="jnd_student_teacher", joinColumns = @JoinColumn(name="student_fk"),
    inverseJoinColumns = @JoinColumn(name="teacher_fk"))
    private List<Teacher> isInStudents;
    public Student(String pib, int course) {
        this.pib=pib;
        this.course=course;
    }
    public Student(){}
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentId != student.studentId) return false;
        if (course != student.course) return false;
        if (pib != null ? !pib.equals(student.pib) : student.pib != null) return false;
        return isInStudents != null ? isInStudents.equals(student.isInStudents) : student.isInStudents == null;
    }

    @Override
    public int hashCode() {
        int result = studentId;
        result = 31 * result + (pib != null ? pib.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + (isInStudents != null ? isInStudents.hashCode() : 0);
        return result;
    }

    /**
     * Created by PANNA on 01.03.2017.
     */
    public static interface StudentDao {
        void addStudent(Student student);
    }
}
