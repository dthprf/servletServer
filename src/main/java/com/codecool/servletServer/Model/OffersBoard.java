package com.codecool.servletServer.Model;

import java.util.ArrayList;

public class OffersBoard {
    private ArrayList<MealOffer> allOffers;

    public OffersBoard(ArrayList<MealOffer> allOffers) {
        this.allOffers = allOffers;
    }

    public ArrayList<MealOffer> getAllOffers() {
        return allOffers;
    }

    public void setAllOffers(ArrayList<MealOffer> allOffers) {
        this.allOffers = allOffers;
    }

    public void addOffer(MealOffer mealOffer) {
        allOffers.add(mealOffer);
    }

    public void deleteOfferByID(Integer offerId) {

        MealOffer deletedOffer;

        for (MealOffer mealOffer : allOffers) {
            if(mealOffer.getOfferId() == offerId) {
                deletedOffer = mealOffer;
                allOffers.remove(deletedOffer);
            }
        }

    }
}
