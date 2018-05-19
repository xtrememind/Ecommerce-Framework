package com.ecf.Orders;

import com.ecf.ShoppingCart.Item;
import com.ecf.domain.Client;
import com.ecf.domain.OrderItems;

import java.util.List;
import java.util.Set;

public class Order {
    private Integer id;
    private Client client;
    private List<Item> items;
    private long totalAmount;

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }
}
