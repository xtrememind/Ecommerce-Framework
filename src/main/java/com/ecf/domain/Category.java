package com.ecf.domain;

import java.util.Set;

public class Category {

    private Integer id;
    private String name;
    private Set<Category> subCategories;
    private Set<Product> products;
    private Category parentCategory;

    public Category() { }
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
