package com.mycompany.app;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by PANNA on 01.03.2017.
 */
public class Student {
    private int studentId;
    private String pib;
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

    /**
     * Created by PANNA on 01.03.2017.
     */
    public static interface StudentDao {
        void addStudent(Student student);
    }
}
