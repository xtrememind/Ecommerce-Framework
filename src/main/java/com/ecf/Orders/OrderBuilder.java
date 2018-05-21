package com.ecf.Orders;

import com.ecf.Repository.OrderRepository;
import com.ecf.ShoppingCart.Item;
import com.ecf.domain.Client;

import java.util.List;
import java.util.Random;

public class OrderBuilder implements IOrderBuilder {
    private Order order;


    @Override
    public void buildOrderDetails(Client client) {
        Random rand = new Random();
        order.setId(rand.nextInt());
        order.setClient(client);
    }

    @Override
    public void buildOrderItems(List<Item> items) {
        order.setItems(items);
    }

    @Override
    public void buildShippingDetails(String shippingAddress) {
        order.setShippingAddress(shippingAddress);
    }

    @Override
    public void buildBillingDetails(String billingAddress) {
        order.setBillingAddress(billingAddress);
    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public Order saveOrder() {
        OrderRepository.getInstance().addOrder(order);
        return null;
    }
}
