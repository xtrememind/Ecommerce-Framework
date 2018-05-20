package com.ecf.Repository;

import com.ecf.domain.Category;
import com.ecf.domain.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StoreRepository {

    private static StoreRepository storeRepository;
    private List<Category> categoriesList;

    public static StoreRepository getInstance() {
        if (storeRepository == null)
            storeRepository = new StoreRepository();
        return storeRepository;
    }

    private StoreRepository() {
        categoriesList = new ArrayList<Category>();
        Category electronics = new Category("Electronics");
        electronics.addSubCategory(new Category("Mobile Phones"));
        electronics.addSubCategory(new Category("Televisions"));
        electronics.addProducts(new Product("Apple Macbook Pro", "Best laptop ever", 1000.00));
        electronics.addProducts(new Product("Apple iPhone", "Best mobile ever", 900.00));
        electronics.addProducts(new Product("Apple Watch", "Best watch ever", 400.00));
        categoriesList.add(electronics);

        Category officeSupplies = new Category("Office Supplies");
        officeSupplies.addSubCategory(new Category("Chairs"));
        officeSupplies.addSubCategory(new Category("Desks"));
        officeSupplies.addProducts(new Product("Zen Desk", "Best desk ever", 400.00));
        officeSupplies.addProducts(new Product("Zen Chair", "Best chair ever", 400.00));
        categoriesList.add(officeSupplies);

        Category appliances = new Category("Appliances");
        appliances.addSubCategory(new Category("ovens"));
        appliances.addSubCategory(new Category("Microwaves"));
        appliances.addProducts(new Product("Toshiba Microwave", "Best microwave ever", 200.00));
        appliances.addProducts(new Product("Samsung Microwave", "Best microwave ever", 300.00));
        categoriesList.add(appliances);
    }


    public void addCategory(Category category) {
        categoriesList.add(category);
    }

    public Category findCategory(Integer id) {
        try {
            Category cat = categoriesList.stream()
                    .filter(u -> u.getId()==id)
                    .findFirst()
                    .get();
            return cat;
        } catch (Exception e) {
            return null;
        }
    }

    public List<Category> getCategoriesList() {
        return categoriesList;
    }

    public List<Product> getAllProduct() {
        return categoriesList.stream().map(c -> c.getProducts()).
                        flatMap(c -> c.stream()).collect(Collectors.toList());
    }

    public List<Product> getCategoryProduct(Integer categoryId) {
        return categoriesList.stream().filter(c->c.getId().equals(categoryId))
                .map(c -> c.getProducts())
                .flatMap(c -> c.stream()).collect(Collectors.toList());
    }


}
