package com.humuson.intern.service;

import com.humuson.intern.dao.OfferDAO;
import com.humuson.intern.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferDAO offerDao;

    public List<Offer> getCurrent() {
        return offerDao.getOffers();
    }

    public void insert(Offer offer) {
        offerDao.insert(offer);
    }
}
