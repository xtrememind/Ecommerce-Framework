package com.ecf.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @ManyToOne()
    @JoinColumn()
    private Client client;

    @OneToMany(mappedBy="order",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<OrderItems> orderItems;

    public Order() { }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public Client getClient() { return client; }
    public void setClient(Client client) { this.client = client; }
    public Set<OrderItems> getOrderItems() { return orderItems; }
    public void setOrderItems(Set<OrderItems> orderItems) { this.orderItems = orderItems; }
}
