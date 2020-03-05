package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {
    private final Catalog catalog = new Catalog();
    private final List<Order> orderList = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName, int orderNumber) {
        Item item = catalog.lookup(itemName);
        Order order = new Order(orderNumber, item);
        orderList.add(order);
    }

    void process() {
        for (Order order : orderList) {
            order.processOrder();
            orderList.remove(order);
        }
    }

    String report() {
        return "\nTotal Itemobjects made: " + catalog.totalItemsMade();
    }
}
