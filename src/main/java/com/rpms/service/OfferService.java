
package com.rpms.service;

import com.rpms.model.Offer;
import java.util.List;

public interface OfferService {

    boolean addOffer(Offer offer);

    Offer getOfferById(int id);

    List<Offer> getAllOffers();

    boolean updateOffer(Offer offer);

    boolean deleteOffer(int id);
}
