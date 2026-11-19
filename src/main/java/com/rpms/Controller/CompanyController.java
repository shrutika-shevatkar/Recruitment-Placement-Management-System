
package com.rpms.controller;

import com.rpms.model.Company;
import com.rpms.service.CompanyService;
import java.util.List;

public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    public boolean addCompany(Company company) {
        return companyService.addCompany(company);
    }

    public Company getCompany(int id) {
        return companyService.getCompanyById(id);
    }

    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}
