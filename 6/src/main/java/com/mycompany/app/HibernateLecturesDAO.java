package com.mycompany.app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by PANNA on 09.03.2017.
 */
@Repository
@Transactional
public class HibernateLecturesDAO implements LecturesDAO {
    @PersistenceContext
    private EntityManager em;

    public Lecture addLecture(Lecture lecture) {
        em.persist(lecture);
        return lecture;
    }

    public Lecture getLecture(int id) {
        return em.find(Lecture.class,id);
    }

    public void saveLecture(Lecture lecture) {
        em.merge(lecture);
    }
}
