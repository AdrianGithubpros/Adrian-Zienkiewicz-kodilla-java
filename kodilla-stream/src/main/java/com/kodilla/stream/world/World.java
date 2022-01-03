package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public final class World {
    List<Continent> listOfContinents = new ArrayList<>();

    public World(List<Continent> listOfContinents) {
        this.listOfContinents = listOfContinents;
    }


    public BigDecimal getPeopleQuantity(){
        BigDecimal allPeople =  listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

            return allPeople;
    }



}
