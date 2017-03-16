package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by PANNA on 01.03.2017.
 */
public class WorkWithStudents {
    @Autowired
    private JDBCStudentDAO studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }
    public Student getStudentFromDbById(int id){
        Student student=studentsDao.getStudentById(id);
        System.out.println("Student with id: "+ id+" is "+ student.getPib());
        return student;
    }
}