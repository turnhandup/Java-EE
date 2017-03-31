package com.mycompany.app;

import org.springframework.stereotype.Repository;

/**
 * Created by PANNA on 08.03.2017.
 */
@Repository
public interface TeacherDAO {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}
