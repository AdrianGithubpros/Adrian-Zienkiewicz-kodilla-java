package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
        private Temperatures temperatures;

        public WeatherForecast(Temperatures temperatures) {
            this.temperatures = temperatures;
        }

        public Map<String, Double> calculateForecast() {
            Map<String, Double> resultMap = new HashMap<>();

            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {



                resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
            }
            return resultMap;
        }

        public double average(){
            double result = 0;
            int counter = 0;
            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {
                counter++;
                result += temperature.getValue();


            }
            result = result/counter;
            return result;
        }

        public double mediana(){
            List<Double> list = new ArrayList<Double>();
            int counter = 0;
            for (Map.Entry<String, Double> temperature :
                    temperatures.getTemperatures().entrySet()) {
                counter++;
                list.add(temperature.getValue());
            }
            Collections.sort(list);
            if(counter%2 == 0 ){
                int place = list.size()/2;
                double ans = (list.get(place-1)+list.get(place))/2;

                return ans;

            }
            int place = (int)(list.size()/2-0.5);

            return list.get(place+1);
        }










}
