package com.ecf.domain;
import javax.persistence.*;

@Entity
@Table(name = "ORDERITEMS")
public class OrderItems {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PRICE")
    private double price;
    @Column(name = "QUANTITY")
    private Integer quantity;

    @ManyToOne()
    @JoinColumn()
    private Product product;

    @ManyToOne()
    @JoinColumn()
    private Order order;

    public OrderItems() { }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
}
