
package com.rpms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlacementTest {

    @Test
    void testPlacementStatus() {
        String status = "Selected";
        assertEquals("Selected", status);
    }
}
