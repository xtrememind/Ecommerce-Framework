package com.ecf.Orders;

public interface IOrderBuilder {
    public void buildOrderDetails();
    public void buildOrderItems();
    public void buildShippingDetails();
    public void buildBillingDetails();
    public Order getOrder();
}

