package com.ecf.Orders;

import com.ecf.ShoppingCart.Item;
import com.ecf.domain.Client;

import java.util.List;

public interface IOrderBuilder {
    public void buildOrderDetails(Client client);

    public void buildOrderItems(List<Item> items);

    public void buildShippingDetails();

    public void buildBillingDetails();

    public Order getOrder();

    public Order saveOrder();
}