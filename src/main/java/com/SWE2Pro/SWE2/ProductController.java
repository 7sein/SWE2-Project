package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository PR;
    @Autowired
    private StoreProductRepository SPR;
    @Autowired
    private StoreRepository SR;

    @GetMapping("/addProduct")
    public Map addProduct() {
        return Collections.singletonMap("status", "NotOk");
    }


    @PostMapping("/addProduct")
    public Map addProduct1(@RequestBody Product pro) {

        List<Product> products = PR.findByName(pro.Name);

        if(products.size() == 0) {
            PR.save(pro);
            return Collections.singletonMap("status", "Ok");
        }

        return Collections.singletonMap("status", "NotOk");

    }

    @RequestMapping("/viewStoreProduct/{storeName}/{productName}")
    public StoreProduct viewProduct(@PathVariable String storeName, @PathVariable String productName) {

        List<StoreProduct> pros = SPR.findByStore(storeName);
        StoreProduct sp = get(pros, productName);
        sp.setUsersViews(sp.getUsersViews() + 1);
        SPR.save(sp);

        return sp;

    }

    @RequestMapping("/buyStoreProduct/{storeName}/{productName}/{quantity}")
    public Map buyProduct(@PathVariable String storeName, @PathVariable String productName, @PathVariable int quantity){

        List<StoreProduct> pros = SPR.findByStore(storeName);
        StoreProduct sp = get(pros, productName);
        sp.setBoughtProducts(sp.getBoughtProducts() + quantity);
        SPR.save(sp);

        return Collections.singletonMap("status", "Ok");

    }

    @RequestMapping("/storeOwner/showStore/{storeName}")
    public List<StoreProduct> showStore(@PathVariable String storeName){

        List<StoreProduct> storeProducts = SPR.findByStore(storeName);

        return storeProducts;
    }

    private StoreProduct get(List<StoreProduct> pros, String productName){

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
