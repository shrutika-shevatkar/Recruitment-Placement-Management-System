package com.rpms.dao;

import com.rpms.model.Company;
import java.util.List;

public interface CompanyDAO {

    boolean addCompany(Company company);

    List<Company> getAllCompanies();

    Company getCompanyById(int id);

    boolean updateCompany(Company company);

    boolean deleteCompany(int id);
}
