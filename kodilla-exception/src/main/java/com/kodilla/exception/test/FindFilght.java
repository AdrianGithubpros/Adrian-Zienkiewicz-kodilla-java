package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFilght {

    public Boolean findFilght(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> flightMap = new HashMap<>();
        flightMap.put("airport1", true);
        flightMap.put("airport2", false);
        flightMap.put("airport3", true);

        for (Map.Entry<String, Boolean> entry :flightMap.entrySet()) {
            if(entry.getKey().equals(flight.arrivalAirport)){
                return entry.getValue();
            }else{
                throw new RouteNotFoundException("There is not airport available");
            }
        }
        return false;
    }

    public static void main(String[] args) {

    Flight flight = new Flight("airport2","airport4");
    FindFilght flightFind = new FindFilght();
        Boolean result = false;
        try {
             result = flightFind.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Forbidden action, error: " + e);
        }

        if(result){
            System.out.println("There is flight available" );
        }else{
            System.out.println("There is no flight available" );
        }


    }


}
