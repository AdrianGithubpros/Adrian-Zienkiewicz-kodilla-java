package com.kodilla.good.patterns.challenges;

public interface AuctionRepository {
    void addAuction(Auction auction , User user);
    void removeAuction(Auction auction, User user);
}
