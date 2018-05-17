package com.ecf.domain;

import javax.persistence.*;

@Entity
@Table(name = "CARTS")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "QUANTITY")
    private Integer quantity;
    @Column(name = "PRICE")
    private double price;
    @ManyToOne()
    @JoinColumn()
    private Client client;
    @ManyToOne()
    @JoinColumn()
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
