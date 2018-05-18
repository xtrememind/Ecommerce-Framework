package com.ecf.domain;

public class ShoppingCart {

    private Integer id;
    private Integer quantity;
    private double price;
    private Client client;
    private Product product;

    public ShoppingCart() { }
    public Integer getId() { return id; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}
