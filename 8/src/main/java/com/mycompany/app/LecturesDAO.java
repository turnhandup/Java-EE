package com.mycompany.app;

/**
 * Created by PANNA on 09.03.2017.
 */
public interface LecturesDAO {
    Lecture addLecture(Lecture lecture);

    Lecture getLecture(int id);

    void saveLecture(Lecture lecture);
}
