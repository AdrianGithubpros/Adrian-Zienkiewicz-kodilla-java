package com.kodilla.good.patterns.challenges;


import java.time.LocalDateTime;
import java.util.Scanner;

public class DataController {

    public User createUser(){
        System.out.println("Please type User name:");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        sc.close();
        return  new User(ans);
    }

    public Auction createAuction(){
         Item item = createItem();
         LocalDateTime  from =  LocalDateTime.of(2022, 2, 1, 12, 0);
         LocalDateTime  to =  LocalDateTime.of(2022, 2, 14, 12, 0);
        return new Auction(item,from,to);
    }
    public Item createItem(){
        System.out.println("Please type item name:");
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        sc.close();

        System.out.println("Please type item info:");
        Scanner sc1 = new Scanner(System.in);
        String ans1 = sc.next();
        sc.close();

        return new Item(ans,ans1);
    }
    public Dto dtoMaker(){

        return new Dto(createAuction(),createUser());
    }

}
