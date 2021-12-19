package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static int testCounter = 0;
    private static Map<String, Double> temperaturesMap = new HashMap<>();
    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");}

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    void testCalculateForecastWithMock(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        double averageTemp = weatherForecast.average();
        double expected = 0;
        for (Map.Entry<String, Double> entry :temperaturesMap.entrySet()) {
            expected +=  entry.getValue();
        }
        expected = expected/temperaturesMap.size();
        //Then
        Assertions.assertEquals(expected,averageTemp);
    }

    @Test
    void testMedianaWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        //When
        double mediana = weatherForecast.mediana();
        //Then
        Assertions.assertEquals(25.5,mediana);
    }


}