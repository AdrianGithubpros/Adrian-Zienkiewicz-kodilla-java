package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String nick;
    private List<Auction> auctionList = new ArrayList<>();

    public User(String nick) {
        this.nick = nick;
    }
    public void addActionToList(Auction auction){
        auctionList.add(auction);
    }
    public void removeActionFromList(Auction auction){
        auctionList.remove(auction);
    }


}