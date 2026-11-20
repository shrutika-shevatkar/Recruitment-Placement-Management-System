
package com.rpms;

import com.rpms.model.Offer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OfferTest {

    @Test
    void testOfferPackage() {
        Offer offer = new Offer(
                1, 1, 1, 4.5, "2026-11-20", "Active"
        );

        assertEquals(4.5, offer.getPackageLpa());
    }

    @Test
    void testOfferStatus() {
        Offer offer = new Offer(
                1, 1, 1, 4.5, "2026-11-20", "Active"
        );

        assertEquals("Active", offer.getStatus());
    }
}

