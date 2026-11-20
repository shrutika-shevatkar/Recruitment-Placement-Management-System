
package com.rpms.controller;

import com.rpms.model.Student;
import com.rpms.service.StudentService;
import java.util.List;

public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public boolean addStudent(Student student) {
        return studentService.addStudent(student);
    }

    public Student getStudent(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public boolean updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    public boolean deleteStudent(int id) {
        return studentService.deleteStudent(id);
    }
}



