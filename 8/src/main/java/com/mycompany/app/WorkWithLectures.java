package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by PANNA on 09.03.2017.
 */
public class WorkWithLectures {
    @Autowired
    LecturesDAO lecturesDao;
    public Lecture addLecture(Lecture lecture){
        lecture = lecturesDao.addLecture(lecture);
        System.out.println(lecture);
        return lecture;
    }
}
