package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
//new WorkWithStudents();
        Student testStudent = new Student("Vlad Valt", 5);

        System.out.println(testStudent.getPib());
        worker.saveStudentToDb(testStudent);
        WorkWithTeacher workWithTeacher =
                (WorkWithTeacher) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();

        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher.setBirthDate(new Date());
        workWithTeacher.getTeacherById(1);
        workWithTeacher.addTeacher(teacher);
        workWithTeacher.saveTacher(teacher);

        Lecture lecture = new Lecture();
        lecture.setName("Introduction to Spring");
        lecture.setCredits(2.5);
        WorkWithLectures worker2 = (WorkWithLectures) context.getBean("lecturesWorker");
        worker2.addLecture(lecture);
    }
}
