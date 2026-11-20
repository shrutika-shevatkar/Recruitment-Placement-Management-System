
package com.rpms.service.impl;

import com.rpms.dao.OfferDAO;
import com.rpms.dao.impl.OfferDAOImpl;
import com.rpms.model.Offer;
import com.rpms.service.OfferService;

import java.util.List;

public class OfferServiceImpl implements OfferService {

    private OfferDAO offerDAO = new OfferDAOImpl();

    @Override
    public boolean addOffer(Offer offer) {
        return offerDAO.addOffer(offer);
    }

    @Override
    public Offer getOfferById(int id) {
        return offerDAO.getOfferById(id);
    }

    @Override
    public List<Offer> getAllOffers() {
        return offerDAO.getAllOffers();
    }

    @Override
    public boolean updateOffer(Offer offer) {
        return offerDAO.updateOffer(offer);
    }

    @Override
    public boolean deleteOffer(int id) {
        return offerDAO.deleteOffer(id);
    }
}


