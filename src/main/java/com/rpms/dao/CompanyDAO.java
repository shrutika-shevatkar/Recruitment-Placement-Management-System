package com.rpms.dao;

import com.rpms.model.Company;
import java.util.List;

public interface CompanyDAO {
    void addCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(int id);
    void updateCompany(Company company);
    void deleteCompany(int id);
}
