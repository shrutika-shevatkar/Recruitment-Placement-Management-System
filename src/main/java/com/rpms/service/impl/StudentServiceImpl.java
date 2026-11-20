
package com.rpms.service.impl;

import com.rpms.dao.StudentDAO;
import com.rpms.dao.impl.StudentDAOImpl;
import com.rpms.model.Student;
import com.rpms.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO = new StudentDAOImpl();

    @Override
    public boolean addStudent(Student student) {
        return studentDAO.addStudent(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDAO.getAllStudents();
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDAO.updateStudent(student);
    }

    @Override
    public boolean deleteStudent(int id) {
        return studentDAO.deleteStudent(id);
    }
}
