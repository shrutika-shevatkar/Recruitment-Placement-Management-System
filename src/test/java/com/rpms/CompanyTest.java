

package com.rpms;

import com.rpms.model.Company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testCompanyName() {
        Company company = new Company(
                1, "TCS", "Software Developer",
                "Pune", 4.5, 6.0
        );

        assertEquals("TCS", company.getName());
    }

    @Test
    void testCompanyLocation() {
        Company company = new Company(
                1, "TCS", "Software Developer",
                "Pune", 4.5, 6.0
        );

        assertEquals("Pune", company.getLocation());
    }
}
