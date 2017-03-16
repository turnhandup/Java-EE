package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by PANNA on 08.03.2017.
 */
public class WorkWithTeacher {
    @Autowired
    private TeacherDAO teachersDao;
    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }
    public void saveTacher(Teacher teacher){
        teachersDao.saveTacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }
}

