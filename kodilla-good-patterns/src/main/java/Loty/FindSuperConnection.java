package Loty;

import java.util.HashMap;
import java.util.Map;

import java.util.stream.Collectors;

public class FindSuperConnection implements ConnectionFounderProcessor{
    @Override
    public HashMap<String,Flight> process(HashMap<String,Flight> map, Flight flight) {


        HashMap<String,Flight> resultMap1 = map.entrySet().stream()
                .filter(n -> !n.getValue().getFrom().equals(flight.getFrom()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev, next) -> next, HashMap::new));

        HashMap<String,Flight> resultMap2 = resultMap1.entrySet().stream()
                .filter(n -> n.getValue().getTo().equals(flight.getTo()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (prev, next) -> next, HashMap::new));

        HashMap<String,Flight> resultMap3 = new HashMap<>();

        for(Map.Entry<String, Flight> entry : resultMap1.entrySet()) {
            String key = entry.getKey();
            Flight value = entry.getValue();

            resultMap3.put(key,value);
        }
        for(Map.Entry<String, Flight> entry : resultMap2.entrySet()) {
            String key = entry.getKey();
            Flight value = entry.getValue();

            resultMap3.put(key,value);
        }

        return resultMap3;
    }
}
