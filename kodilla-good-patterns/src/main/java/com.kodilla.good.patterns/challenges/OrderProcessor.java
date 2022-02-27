package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private AuctionRepository auctionRepository;
    private AuctionService auctionService;

    public OrderProcessor(InformationService informationService, AuctionRepository auctionRepository, AuctionService auctionService) {
        this.informationService = informationService;
        this.auctionRepository = auctionRepository;
        this.auctionService = auctionService;
    }


    public void process(Dto dto) {
        boolean auctionHasBeenCreated = auctionService.createAuction(dto.getUser(),dto.getAuction());

        if (auctionHasBeenCreated) {
            informationService.informUserBuy(dto.getAuction().getItem());
            auctionRepository.addAuction(dto.getAuction(), dto.getUser());

        } else {

            System.out.println("Auction has not been created");
        }
    }

}
