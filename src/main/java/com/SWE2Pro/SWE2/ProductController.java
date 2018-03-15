package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductRepository PR;

    @GetMapping("/addProduct")
    public String addProduct(Model model) {

        model.addAttribute("Product", new Product());
        model.addAttribute("Brand", new Brand());

        return "AdminProfile";

    }


    @PostMapping("/addProduct")
    public String addProduct1(@ModelAttribute @Valid Product pro, BindingResult bindingResult,  Model model) {

        List<Product> products = PR.findByName(pro.Name);

        if(products.size() == 0) {
            PR.save(pro);
        }

        model.addAttribute("Product", new Product());
        model.addAttribute("Brand", new Brand());

        return "AdminProfile";

    }

}
