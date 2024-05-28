package jrs.tp.wmd.ecommerce.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jrs.tp.wmd.ecommerce.model.Order;
import jrs.tp.wmd.ecommerce.repository.Repository;

public class OrderManagementService {

    private Map<Long, Order> orders = Repository.getOrders();

    public List<Order> getOrders() {
        return new ArrayList<>(orders.values());
    }

    public Order submitOrder(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public Order getOrderDetails(long orderId) {
        return orders.get(orderId);
    }

    public List<Order> getOrdersForCustomer(long customerId) {
        return orders.values().stream()
                .filter(order -> order.getCustomer().getId() == customerId)
                .collect(Collectors.toList());
    }

    public Order updateOrder(Order order) {
        orders.put(order.getId(), order);
        return order;
    }

    public Order cancelOrder(long orderId) {
        return orders.remove(orderId);
    }
}

