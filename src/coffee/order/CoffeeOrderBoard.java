package coffee.order;

import java.util.LinkedList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders = new LinkedList<>();
    private int nextOrderNumber = 1;

    public void add(String customerName) {
        Order order = new Order(nextOrderNumber, customerName);
        orders.addLast(order);
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order order = orders.removeFirst();
            System.out.println("Delivering order: " + order);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.remove(order);
                System.out.println("Delivering order: " + order);
                return;
            }
        }
        System.out.println("Order not found.");
    }

    public void draw() {
        System.out.println("=============\nNum | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}