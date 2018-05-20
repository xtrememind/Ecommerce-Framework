package com.app;

import com.ecf.Repository.StoreRepository;
import com.ecf.domain.Category;
import com.ecf.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String greeting(@RequestParam(name="id", required=false) Integer id, Model model)
    {
        List<Product> products;
        StoreRepository storeRepository =StoreRepository.getInstance();
        if(id==null) {
            products = storeRepository.getAllProduct();
        }
        else{
            products = storeRepository.getCategoryProduct(id);
        }
        List<Category> categoryList=storeRepository.getCategoriesList();
        model.addAttribute("categoryList",categoryList);
        model.addAttribute("products",products);
        return "home";
    }
}
