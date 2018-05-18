package com.ecf.Orders;

import com.ecf.domain.Client;
import com.ecf.domain.OrderItems;

import java.util.Set;

public class Order {
    private Integer id;
    private Client client;
    private Set<OrderItems> orderItems;
    private long totalAmount;

    public Order() { }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Set<OrderItems> getOrderItems() { return orderItems; }
    public void setOrderItems(Set<OrderItems> orderItems) { this.orderItems = orderItems; }
    public long getTotalAmount() { return totalAmount; }
    public void setTotalAmount(long totalAmount) { this.totalAmount = totalAmount; }
}
