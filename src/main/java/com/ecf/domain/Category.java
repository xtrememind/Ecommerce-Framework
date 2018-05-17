package com.ecf.domain;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CATEGORIES")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy="parentCategory",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Category> subCategories;


    @OneToMany(mappedBy="category",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private Set<Product> products;

    @ManyToOne()
    @JoinColumn()
    private Category parentCategory;

    public Category() {

    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }


    public Set<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(Set<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
