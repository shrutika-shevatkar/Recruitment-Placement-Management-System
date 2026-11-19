
package com.rpms.service;

import com.rpms.model.Company;
import java.util.List;

public interface CompanyService {

    boolean addCompany(Company company);

    Company getCompanyById(int id);

    List<Company> getAllCompanies();

    boolean updateCompany(Company company);

    boolean deleteCompany(int id);
}
