package com.ecf.domain;

import java.util.Random;
import java.util.Set;

public class Category {

    private Integer id;
    private String name;
    private Set<Category> subCategories;
    private Set<Product> products;

    public Category(String name) {
        Random rand = new Random();
        id = rand.nextInt();
        this.name = name;
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

    public void addSubCategory(Category cat) {
        subCategories.add(cat);
    }

    public void addProducts(Product prod) {
        products.add(prod);
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
