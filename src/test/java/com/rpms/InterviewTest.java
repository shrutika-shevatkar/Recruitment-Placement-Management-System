
package com.rpms;

import com.rpms.model.Interview;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InterviewTest {

    @Test
    void testInterviewStatus() {
        Interview interview = new Interview(
                1, 1, 1, "2026-12-01", "Scheduled"
        );

        assertEquals("Scheduled", interview.getStatus());
    }

    @Test
    void testInterviewDate() {
        Interview interview = new Interview(
                1, 1, 1, "2026-12-01", "Scheduled"
        );

        assertEquals("2026-12-01", interview.getInterviewDate());
    }
}

