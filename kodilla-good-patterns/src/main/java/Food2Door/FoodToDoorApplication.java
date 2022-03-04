package Food2Door;


import java.util.*;

public class FoodToDoorApplication {
    public static void main(String[] args) {
     OrderProcessor orderProcessor = new OrderProcessor();
     Order order = orderProcessor.takeOrder();
     ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", new ArrayList<Order>());
     orderProcessor.makeOrder(order,extraFoodShop);



    }
}