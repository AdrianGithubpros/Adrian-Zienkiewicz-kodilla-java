package com.kodilla.good.patterns.challenges;

public class ActionCreator implements AuctionService{


    @Override
    public boolean createAuction(User user ,Auction auction) {
        System.out.println("Create action code");



        return true;
    }
}
