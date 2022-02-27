package com.kodilla.good.patterns.challenges;

public class Dto {
    private Auction auction;
    private User user;


    public Dto(Auction auction, User user) {
        this.auction = auction;
        this.user = user;

    }

    public Auction getAuction() {
        return auction;
    }

    public User getUser() {
        return user;
    }
}
