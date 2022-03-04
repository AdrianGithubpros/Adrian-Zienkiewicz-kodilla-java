package Loty;

import Food2Door.ExtraFoodShop;
import Food2Door.Order;
import Food2Door.OrderProcessor;

import java.util.ArrayList;
import java.util.HashMap;

public class FlightApplication {
    public static void main(String[] args) {
     DataStorage dataStorage = new DataStorage(new HashMap<String,Flight>());
     FindFlightFrom findFlightFrom = new FindFlightFrom();
     HashMap<String,Flight> possibleRoute = findFlightFrom.process(dataStorage.flightMap, new Flight("Wa-wa","Wroclaw"));


    }
}
