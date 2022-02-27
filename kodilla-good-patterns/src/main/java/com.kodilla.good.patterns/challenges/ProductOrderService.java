package com.kodilla.good.patterns.challenges;


public class ProductOrderService {
    public static void main(String[] args) {
        DataController dataController = new DataController();
        Dto dto = dataController.dtoMaker();
   OrderProcessor orderProcessor = new OrderProcessor(new InformViaMail() , new AuctionRepositoryController(),new ActionCreator());
   orderProcessor.process(dto);

    }
}
