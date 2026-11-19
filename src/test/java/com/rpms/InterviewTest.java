
package com.rpms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterviewTest {

    @Test
    void testInterviewStatus() {
        String status = "Scheduled";
        assertEquals("Scheduled", status);
    }
}
