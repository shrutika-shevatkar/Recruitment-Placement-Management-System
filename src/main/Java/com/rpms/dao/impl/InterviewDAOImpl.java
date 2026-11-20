package com.rpms.dao.impl;

import com.rpms.dao.InterviewDAO;
import com.rpms.model.Interview;
import com.rpms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InterviewDAOImpl implements InterviewDAO {

    @Override
    public void addInterview(Interview interview) {
        String sql = "INSERT INTO interviews "
                + "(student_id, company_id, interview_date, status) "
                + "VALUES (?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, interview.getStudentId());
            ps.setInt(2, interview.getCompanyId());
            ps.setDate(3, java.sql.Date.valueOf(interview.getInterviewDate()));
            ps.setString(4, interview.getStatus());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Interview> getAllInterviews() {
        List<Interview> interviews = new ArrayList<>();
        String sql = "SELECT * FROM interviews";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Interview interview = new Interview(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getInt("company_id"),
                        rs.getDate("interview_date").toString(),
                        rs.getString("status")
                );

                interviews.add(interview);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return interviews;
    }

    @Override
    public Interview getInterviewById(int id) {
        String sql = "SELECT * FROM interviews WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Interview(
                            rs.getInt("id"),
                            rs.getInt("student_id"),
                            rs.getInt("company_id"),
                            rs.getDate("interview_date").toString(),
                            rs.getString("status")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void updateInterview(Interview interview) {
        String sql = "UPDATE interviews SET student_id = ?, "
                + "company_id = ?, interview_date = ?, status = ? "
                + "WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, interview.getStudentId());
            ps.setInt(2, interview.getCompanyId());
            ps.setDate(3, java.sql.Date.valueOf(interview.getInterviewDate()));
            ps.setString(4, interview.getStatus());
            ps.setInt(5, interview.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteInterview(int id) {
        String sql = "DELETE FROM interviews WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
