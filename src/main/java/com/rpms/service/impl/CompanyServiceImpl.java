package com.rpms.service.impl;

import com.rpms.dao.CompanyDAO;
import com.rpms.dao.impl.CompanyDAOImpl;
import com.rpms.model.Company;
import com.rpms.service.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    private CompanyDAO companyDAO = new CompanyDAOImpl();

    @Override
    public boolean addCompany(Company company) {
        return companyDAO.addCompany(company);
    }

    @Override
    public Company getCompanyById(int id) {
        return companyDAO.getCompanyById(id);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyDAO.getAllCompanies();
    }

    @Override
    public boolean updateCompany(Company company) {
        return companyDAO.updateCompany(company);
    }

    @Override
    public boolean deleteCompany(int id) {
        return companyDAO.deleteCompany(id);
    }
}
