package com.ecf.Orders;

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
    public void buildShippingDetails() {

    }

    @Override
    public void buildBillingDetails() {

    }

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public Order saveOrder() {
        return null;
    }
}
