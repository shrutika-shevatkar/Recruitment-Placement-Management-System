package com.rpms.dao.impl;

import com.rpms.dao.CompanyDAO;
import com.rpms.model.Company;
import com.rpms.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CompanyDAOImpl implements CompanyDAO {

    @Override
    public void addCompany(Company company) {
        String sql = "INSERT INTO companies "
                + "(id, name, role, location, package_lpa, min_cgpa) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, company.getId());
            ps.setString(2, company.getName());
            ps.setString(3, company.getRole());
            ps.setString(4, company.getLocation());
            ps.setDouble(5, company.getPackageLpa());
            ps.setDouble(6, company.getMinCgpa());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Company> getAllCompanies() {
        List<Company> companies = new ArrayList<>();
        String sql = "SELECT * FROM companies";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Company company = new Company(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("role"),
                        rs.getString("location"),
                        rs.getDouble("package_lpa"),
                        rs.getDouble("min_cgpa")
                );

                companies.add(company);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return companies;
    }

    @Override
    public Company getCompanyById(int id) {
        String sql = "SELECT * FROM companies WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Company(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("role"),
                            rs.getString("location"),
                            rs.getDouble("package_lpa"),
                            rs.getDouble("min_cgpa")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void updateCompany(Company company) {
        String sql = "UPDATE companies SET name = ?, role = ?, "
                + "location = ?, package_lpa = ?, min_cgpa = ? "
                + "WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, company.getName());
            ps.setString(2, company.getRole());
            ps.setString(3, company.getLocation());
            ps.setDouble(4, company.getPackageLpa());
            ps.setDouble(5, company.getMinCgpa());
            ps.setInt(6, company.getId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCompany(int id) {
        String sql = "DELETE FROM companies WHERE id = ?";

        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
