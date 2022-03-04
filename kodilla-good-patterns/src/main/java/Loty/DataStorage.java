package Loty;


import java.util.HashMap;


public class DataStorage {
    HashMap<String, Flight>  flightMap;

    public DataStorage(HashMap<String, Flight> flightMap) {
        this.flightMap = flightMap;
    }

    public HashMap<String, Flight> getFlightMap() {
        return flightMap;
    }

    public void setFlightMap(HashMap<String, Flight> flightMap) {
        this.flightMap = flightMap;
    }

    public void addToMap(Flight flight){
        flightMap.put(flight.getFrom() + " " + flight.getTo(),flight);

    }



}
