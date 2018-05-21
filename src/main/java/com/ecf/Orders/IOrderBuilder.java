package com.ecf.Orders;

import com.ecf.ShoppingCart.Item;
import com.ecf.domain.Client;

import java.util.List;

public interface IOrderBuilder {
    public void buildOrderDetails(Client client);

    public void buildOrderItems(List<Item> items);

    public void buildShippingDetails(String shippingAddress);

    public void buildBillingDetails(String billingAddress);

    public Order getOrder();

    public Order saveOrder();
}