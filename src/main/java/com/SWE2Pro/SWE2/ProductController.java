package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductRepository PR;

    @GetMapping("/addProduct")
    public String addProduct(Model model) {
        model.addAttribute("Product", new Product());
        return "index";
    }

    @PostMapping("/addProduct")
    public String addProduct1(@ModelAttribute Product pro, Model model) {

        List<Product> prod = PR.findByName(pro.Name);
        model.addAttribute("Product", new Product());
        model.addAttribute("Brand", new Brand());
        if(prod.size() == 0) {
            PR.save(pro);
        }
        return "AdminProfile";

    }

}
