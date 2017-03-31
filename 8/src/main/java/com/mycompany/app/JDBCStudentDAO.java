package com.mycompany.app;

import com.googlecode.ehcache.annotations.Cacheable;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by PANNA on 01.03.2017.
 */
@Repository
public class JDBCStudentDAO extends StudentDAO {
    private static final String SQL_INSERT_STUDENT = "insert into student (pib,course) values (?,?)";

    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public void addStudent(Student student) {
        jdbcTemplate.update(SQL_INSERT_STUDENT,
                student.getPib(),
                student.getCourse());
    }
    private static final String SQL_SELECT_STUDENT_BY_ID = "select studentId, pib, course from student where studentId = ?";
   @Cacheable(cacheName="studentsCache")
    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_ID,
                new ParameterizedRowMapper<Student>() {

                    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Student student = new Student();
                        student.setStudentId(rs.getInt(1));
                        student.setPib(rs.getString(2));
                        student.setCourse(rs.getInt(3));
                        return student;
                    }
                }, id);
    }
    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "agisdb" );
    EntityManager entitymanager = emfactory.createEntityManager();
    public List<Student> getStudentsByCourse(int course){
        Query query= entitymanager.createNamedQuery("Student.findByCourse");
        query.setParameter("course", course);
        List<Student> list = query.getResultList();
        return list;
    }

    public List<Student> getStudents(){
        Query query=entitymanager.createNamedQuery("Student.findAll");
        List<Student> list = query.getResultList();
        return list;
    }
}
