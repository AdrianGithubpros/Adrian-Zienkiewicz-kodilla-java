package Loty;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFlightTo implements ConnectionFounderProcessor{
    @Override
    public HashMap<String,Flight> process(HashMap<String,Flight> map, Flight flight) {
        HashMap<String,Flight> resultMap = map.entrySet().stream()

                .filter(n -> n.getValue().getTo().equals(flight.getTo()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev, next) -> next, HashMap::new));

        return resultMap;
    }
}
