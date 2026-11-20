package com.rpms.dao.impl;

import com.rpms.dao.OfferDAO;
import com.rpms.model.Offer;
import com.rpms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfferDAOImpl implements OfferDAO {

    @Override
    public boolean addOffer(Offer offer) {
        String sql = "INSERT INTO offers "
                + "(student_id, company_id, package_lpa, offer_date, status) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, offer.getStudentId());
            ps.setInt(2, offer.getCompanyId());
            ps.setDouble(3, offer.getPackageLpa());
            ps.setDate(4, java.sql.Date.valueOf(offer.getOfferDate()));
            ps.setString(5, offer.getStatus());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Offer getOfferById(int offerId) {
        String sql = "SELECT * FROM offers WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, offerId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Offer(
                            rs.getInt("id"),
                            rs.getInt("student_id"),
                            rs.getInt("company_id"),
                            rs.getDouble("package_lpa"),
                            rs.getDate("offer_date").toString(),
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
    public List<Offer> getAllOffers() {
        List<Offer> offers = new ArrayList<>();
        String sql = "SELECT * FROM offers";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Offer offer = new Offer(
                        rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getInt("company_id"),
                        rs.getDouble("package_lpa"),
                        rs.getDate("offer_date").toString(),
                        rs.getString("status")
                );

                offers.add(offer);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return offers;
    }

    @Override
    public boolean updateOffer(Offer offer) {
        String sql = "UPDATE offers SET student_id = ?, company_id = ?, "
                + "package_lpa = ?, offer_date = ?, status = ? WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, offer.getStudentId());
            ps.setInt(2, offer.getCompanyId());
            ps.setDouble(3, offer.getPackageLpa());
            ps.setDate(4, java.sql.Date.valueOf(offer.getOfferDate()));
            ps.setString(5, offer.getStatus());
            ps.setInt(6, offer.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteOffer(int offerId) {
        String sql = "DELETE FROM offers WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, offerId);
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
