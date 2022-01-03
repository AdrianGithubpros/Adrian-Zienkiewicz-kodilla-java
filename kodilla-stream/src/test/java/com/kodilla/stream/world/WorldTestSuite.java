package com.kodilla.stream.world;

import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal("12534673"));
        Country germany = new Country(new BigDecimal("1232189"));
        Country france = new Country(new BigDecimal("98632345"));
        List<Country> list1 = new ArrayList<>();
        list1.add(poland);
        list1.add(germany);
        list1.add(france);
        Continent europe = new Continent(list1);
        Country china = new Country(new BigDecimal("162623"));
        Country japan = new Country(new BigDecimal("986832"));
        Country india = new Country(new BigDecimal("9146023"));
        List<Country> list2 = new ArrayList<>();
        list1.add(china);
        list1.add(japan);
        list1.add(india);
        Continent asia = new Continent(list2);
        Country usa = new Country(new BigDecimal("12323423"));
        Country canada = new Country(new BigDecimal("92342234"));
        Country mexico = new Country(new BigDecimal("92423234"));
        List<Country> list3= new ArrayList<>();
        list1.add(usa);
        list1.add(canada);
        list1.add(mexico);
        Continent northAmerica = new Continent(list3);
        List<Continent> continentsList = new ArrayList<>();
        continentsList.add(europe);
        continentsList.add(asia);
        continentsList.add(northAmerica);
        World world = new World(continentsList);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();


        //Then
        BigDecimal expectedResult = new BigDecimal("319783576");
        assertEquals(expectedResult, totalPeople);
    }

}
