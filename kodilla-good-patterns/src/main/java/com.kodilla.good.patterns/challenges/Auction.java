package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;

public class Auction {
    private Item item;
    private LocalDateTime from;
    private LocalDateTime to;

    public Auction(Item item, LocalDateTime from, LocalDateTime to) {
        this.item = item;
        this.from = from;
        this.to = to;
    }

    public Item getItem() {
        return item;
    }


}
