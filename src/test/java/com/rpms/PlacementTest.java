
package com.rpms;

import com.rpms.model.Placement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlacementTest {

    @Test
    void testPlacementStudentId() {
        Placement placement = new Placement(
                1, 1, 1, "2026-11-20"
        );

        assertEquals(1, placement.getStudentId());
    }

    @Test
    void testPlacementCompanyId() {
        Placement placement = new Placement(
                1, 1, 1, "2026-11-20"
        );

        assertEquals(1, placement.getCompanyId());
    }

    @Test
    void testPlacementDate() {
        Placement placement = new Placement(
                1, 1, 1, "2026-11-20"
        );

        assertEquals("2026-11-20", placement.getPlacedOn());
    }
}

