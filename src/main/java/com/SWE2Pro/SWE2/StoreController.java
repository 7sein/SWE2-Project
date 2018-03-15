package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StoreController {

    @Autowired
    private StoreRepository SR;
    @Autowired
    private ProductRepository PR;
    @Autowired
    private BrandRepository BR;
    @Autowired
    private StoreProductRepository SPR;



    @GetMapping("/addstore")
    public String addstore(Model model) {

        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());
        return "index";

    }

    @PostMapping("/addstore")
    public String addstore1(@ModelAttribute @Valid Store sto, Model model, HttpServletRequest sessions) {

        List<Store> stores = SR.findByName(sto.Name);
        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());

        if(stores.size() == 0){
            sto.storeOwner = (User) sessions.getSession().getAttribute("owner");
            SR.save(sto);
        }


        return "StoreOwnerProfile";

    }

    @RequestMapping("/showStore/{storeName}")
    public String showStore(Model model, @PathVariable String storeName){
        model.addAttribute("products", SPR.findByStore(storeName));
        return "CustomerProfile";
    }

    @GetMapping("/addProductToStore")
    public String addProductToStore(Model model){
        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());
        return "StoreOwnerProfile";
    }

    @PostMapping("/addProductToStore")
    public String addProductToStore1(@ModelAttribute @Valid StoreProduct SP, Model model) {

        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());

        List<Product> products = PR.findByName(SP.Product);
        List<Product> brands   = PR.findByName(SP.Brand);
        List<Product> stores   = PR.findByName(SP.Store);

        if(products.size() == 0 || brands.size() == 0 || stores.size() == 0) {
            return "StoreOwnerProfile";
        }

        SP.setStoreID(stores.get(0).getId());
        SP.setProductID(products.get(0).getId());
        SP.setBrandID(brands.get(0).getId());

        SPR.save(SP);

        return "StoreOwnerProfile";

    }

}
