package com.ecf.Repository;

import com.ecf.Orders.Order;
import com.ecf.domain.Address;
import com.ecf.domain.Client;
import com.ecf.registration.models.Admin;
import com.ecf.registration.models.User;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private static OrderRepository orderRepository;
    List<Order> listOrder;

    private OrderRepository() {

    }

    public static OrderRepository getInstance() {
        if (orderRepository == null)
            orderRepository = new OrderRepository();
        return orderRepository;
    }

    public void addOrder(Order order) {
        listOrder.add(order);
    }

}
