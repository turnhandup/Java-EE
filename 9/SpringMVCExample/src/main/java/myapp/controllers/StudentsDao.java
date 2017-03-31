package myapp.controllers;

import java.util.List;

/**
 * Created by PANNA on 31.03.2017.
 */
public interface StudentsDao {

    Student addStudent(Student student);
    Student getStudentById(int studentId);
    List<Student> getAllStudents();
    Student getStudentByPIB(String pib);
    List<Student> getAllStudentsByCourse(int course);
    void saveStudent(Student student);

}