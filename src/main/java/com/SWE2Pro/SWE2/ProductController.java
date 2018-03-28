package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {

    @Autowired
    private ProductRepository PR;
    @Autowired
    private StoreProductRepository SPR;
    @Autowired
    private StoreRepository SR;

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

    @RequestMapping("/viewStoreProduct/{storeName}/{productName}")
    public String viewProduct(Model model, @PathVariable String storeName, @PathVariable String productName) {

        model.addAttribute("Products", SPR.findByStore(storeName));
        model.addAttribute("Stores",  SR.findAll());

        List<StoreProduct> pros = SPR.findByStore(storeName);

        StoreProduct sp = get(pros, productName);

        sp.setUsersViews(sp.getUsersViews() + 1);

        SPR.save(sp);

        return "CustomerProfile";

    }

    @RequestMapping("/buyStoreProduct/{storeName}/{productName}/{quantity}")
    public String buyProduct(Model model, @PathVariable String storeName, @PathVariable String productName, @PathVariable int quantity){

        model.addAttribute("Products", SPR.findByStore(storeName));
        model.addAttribute("Stores",  SR.findAll());

        List<StoreProduct> pros = SPR.findByStore(storeName);

        StoreProduct sp = get(pros, productName);

        sp.setBoughtProducts(sp.getBoughtProducts() + quantity);

        SPR.save(sp);

        return "CustomerProfile";

    }

    @RequestMapping("/storeOwner/showStore/{storeName}")
    public String showStore(Model model, @PathVariable String storeName, HttpServletRequest sessions){

        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());

        List<Store> stores1 = SR.findAll();
        model.addAttribute("Stores", getStores((User)sessions.getSession().getAttribute("owner"), stores1));

        List<StoreProduct> storeProducts = SPR.findByStore(storeName);
        model.addAttribute("StoreProducts", storeProducts);

        return "StoreOwnerProfile";

    }

    public StoreProduct get(List<StoreProduct> pros, String productName){

        for(int i=0; i<pros.size(); ++i){
            if(pros.get(i).getProduct().equals(productName)){
                return pros.get(i);
            }
        }

        return null;

    }

    public List<Store> getStores(User owner, List<Store> stores){

        List<Store> stores1 = new ArrayList<>();

        for(int i=0; i<stores.size(); ++i){

            if(stores.get(i).getStoreOwner().equals(owner)){
                stores1.add(stores.get(i));
            }

        }

        return stores1;

    }



}
