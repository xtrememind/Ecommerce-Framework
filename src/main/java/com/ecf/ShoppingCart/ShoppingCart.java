package com.ecf.ShoppingCart;

import com.ecf.Payment.Strategy.IPaymentStrategy;
import com.ecf.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private Integer id;
    private Integer quantity;
    private double price;
    private Client client;
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public Integer getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotal() {
        double sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }
}
