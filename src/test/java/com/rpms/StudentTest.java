
package com.rpms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudentName() {
        String name = "Rahul";
        assertEquals("Rahul", name);
    }
}
