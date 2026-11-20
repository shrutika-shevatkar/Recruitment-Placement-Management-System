
package com.rpms.controller;

import com.rpms.model.Offer;
import com.rpms.service.OfferService;
import java.util.List;

public class OfferController {

    private OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    public boolean addOffer(Offer offer) {
        return offerService.addOffer(offer);
    }

    public Offer getOffer(int id) {
        return offerService.getOfferById(id);
    }

    public List<Offer> getAllOffers() {
        return offerService.getAllOffers();
    }

    public boolean updateOffer(Offer offer) {
        return offerService.updateOffer(offer);
    }

    public boolean deleteOffer(int id) {
        return offerService.deleteOffer(id);
    }
}

