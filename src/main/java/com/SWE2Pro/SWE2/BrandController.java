package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BrandController {

    @Autowired
    private BrandRepository BR;

    @GetMapping("/addBrand")
    public String addBrand(Model model) {
        model.addAttribute("Product", new Product());
        model.addAttribute("Brand", new Brand());
        return "AdminProfile";
    }

    @PostMapping("/addBrand")
    public String addBrand1(@ModelAttribute Brand brand, Model model) {

        model.addAttribute("Product", new Product());
        model.addAttribute("Brand", new Brand());
        List<Brand> brands = BR.findByName(brand.getName());
        if(brands.size() == 0){
            BR.save(brand);
        }

        return "AdminProfile";
    }

}
