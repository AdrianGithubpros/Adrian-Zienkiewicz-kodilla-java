package Food2Door;

import java.util.List;

public class OrderCreator{

    public boolean checkOrder(Order order,  List<Order> list) {
        for (Order orderCheck : list) {
            if (orderCheck.getName().equals(order.getName()) && orderCheck.getNumber() >= order.getNumber()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}