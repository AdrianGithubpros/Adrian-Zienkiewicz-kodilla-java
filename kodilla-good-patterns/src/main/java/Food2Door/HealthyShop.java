package Food2Door;

import java.util.List;

public class HealthyShop implements Processor{
    String name;
    List<Order> itemList;
    OrderCreator orderCreator = new OrderCreator();

    public HealthyShop(String name, List<Order> itemList) {
        this.name = name;
        this.itemList = itemList;
    }

    @Override
    public boolean process(Order order) {
        return orderCreator.checkOrder(order, this.itemList);
    }
}
