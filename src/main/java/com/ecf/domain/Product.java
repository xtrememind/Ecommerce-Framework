package com.ecf.domain;

public class Product {
    private Integer id;
    private String name;
    private Category category;

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
