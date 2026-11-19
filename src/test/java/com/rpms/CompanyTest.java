
package com.rpms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void testCompanyName() {
        String name = "TCS";
        assertEquals("TCS", name);
    }
}
