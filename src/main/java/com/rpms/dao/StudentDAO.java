
package com.rpms.dao;

import com.rpms.model.Student;
import java.util.List;

public interface StudentDAO {

    boolean addStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    boolean updateStudent(Student student);

    boolean deleteStudent(int id);
}

