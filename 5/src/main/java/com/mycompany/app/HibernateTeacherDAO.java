package com.mycompany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by PANNA on 08.03.2017.
 */
@Repository
public class HibernateTeacherDAO implements  TeacherDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Transactional
    private Session currentSession(){
        return sessionFactory.getCurrentSession();
    }
    @Transactional
    public void addTeacher(Teacher teacher) {
        currentSession().save(teacher);
    }
    @Transactional
    public Teacher getTeacherById(int id) {
        return (Teacher) currentSession().get(Teacher.class, id);
    }
    @Transactional
    public void saveTacher(Teacher teacher) {
        currentSession().update(teacher);
    }
}
