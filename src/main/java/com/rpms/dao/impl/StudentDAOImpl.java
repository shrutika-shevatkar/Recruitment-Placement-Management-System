package com.rpms.dao.impl;

import com.rpms.dao.StudentDAO;
import com.rpms.model.Student;
import com.rpms.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public boolean addStudent(Student student) {
        String sql = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.setString(4, student.getDepartment());
            ps.setDouble(5, student.getCgpa());
            ps.setInt(6, student.getActiveBacklogs());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>();
    }

    @Override
    public boolean updateStudent(Student student) {
        return false;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }
}
