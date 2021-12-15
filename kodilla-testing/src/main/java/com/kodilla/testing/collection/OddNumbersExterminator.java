package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenList = new ArrayList<>();
        for (Integer x: numbers) {
            if(x%2 == 0){
                evenList.add(x);
            }
        }

        return evenList;

}





}
