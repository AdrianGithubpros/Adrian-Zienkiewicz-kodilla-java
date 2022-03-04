package Loty;

import java.util.HashMap;

public interface ConnectionFounderProcessor {
    HashMap<String,Flight> process(HashMap<String,Flight> map,Flight flight);
}
