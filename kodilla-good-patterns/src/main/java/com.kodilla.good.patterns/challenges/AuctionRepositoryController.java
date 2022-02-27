package com.kodilla.good.patterns.challenges;

public class AuctionRepositoryController implements AuctionRepository{


    @Override
    public void addAuction(Auction auction, User user) {

        user.addActionToList(auction);

    }

    @Override
    public void removeAuction(Auction auction , User user) {
        user.removeActionFromList(auction);
    }
}
