
package com.rpms.dao;

import com.rpms.model.Offer;
import java.util.List;

public interface OfferDAO {

    boolean addOffer(Offer offer);

    Offer getOfferById(int offerId);

    List<Offer> getAllOffers();

    boolean updateOffer(Offer offer);

    boolean deleteOffer(int offerId);
}
