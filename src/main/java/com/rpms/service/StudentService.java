
package com.rpms.service;

import com.rpms.model.Student;
import java.util.List;

public interface StudentService {

    boolean addStudent(Student student);

    Student getStudentById(int id);

    List<Student> getAllStudents();

    boolean updateStudent(Student student);

    boolean deleteStudent(int id);
}
