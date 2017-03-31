package myapp.controllers;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by PANNA on 31.03.2017.
 */
@Entity
@Table(name="student")
@NamedQueries({
        @NamedQuery(name = Student.getAllStudents, query = "SELECT student FROM Student student"),
        @NamedQuery(name =Student.getStudentByPib, query = "SELECT student FROM Student student WHERE student.pib = :pib"),
        @NamedQuery(name =Student.getStudentsByCourse, query = "SELECT student FROM Student student WHERE student.course = :course")
})
public class Student implements Serializable {
    public static final String getAllStudents = "Student.getAllStudents";
    public static final String getStudentByPib = "Student.getStudentByPib";
    public static final String getStudentsByCourse = "Student.getStudentsByCourse";
    @Id
    @GeneratedValue
    @Column(name = "studentId")
    private int studentId;
    @Column(name="pib")
    private String pib;
    @Column(name="course")
    private int course;
//getters, setters, equals, hash

    public static String getGetAllStudents() {
        return getAllStudents;
    }

    public static String getGetStudentByPib() {
        return getStudentByPib;
    }

    public static String getGetStudentsByCourse() {
        return getStudentsByCourse;
    }

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
}