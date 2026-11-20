package com.rpms.dao.impl;

import com.rpms.dao.PlacementDAO;
import com.rpms.model.Placement;
import com.rpms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlacementDAOImpl implements PlacementDAO {

    @Override
    public boolean addPlacement(Placement placement) {
        String sql = "INSERT INTO placements "
                + "(student_id, company_id, placed_on) VALUES (?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, placement.getStudentId());
            ps.setInt(2, placement.getCompanyId());
            ps.setDate(3, java.sql.Date.valueOf(placement.getPlacedOn()));

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Placement getPlacementById(int placementId) {
        String sql = "SELECT * FROM placements WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, placementId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Placement(
                            rs.getInt("id"),
                            rs.getInt("student_id"),
                            rs.getInt("company_id"),
                            rs.getDate("placed_on").toString()
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Placement> getAllPlacements() {
        List<Placement> placements = new ArrayList<>();
        String sql = "SELECT * FROM placements";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Placement placement = new Placement(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getInt("company_id"),
                        rs.getDate("placed_on").toString()
                );

                placements.add(placement);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return placements;
    }

    @Override
    public boolean updatePlacement(Placement placement) {
        String sql = "UPDATE placements SET student_id = ?, "
                + "company_id = ?, placed_on = ? WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, placement.getStudentId());
            ps.setInt(2, placement.getCompanyId());
            ps.setDate(3, java.sql.Date.valueOf(placement.getPlacedOn()));
            ps.setInt(4, placement.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deletePlacement(int placementId) {
        String sql = "DELETE FROM placements WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, placementId);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
