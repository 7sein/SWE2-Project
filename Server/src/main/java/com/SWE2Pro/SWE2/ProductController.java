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

    @RequestMapping("/getProduct/{storeName}/{productName}")
    public StoreProduct getProduct(@PathVariable String storeName, @PathVariable String productName){

        List<StoreProduct> products = SPR.findByStore(storeName);

        for(StoreProduct sp: products){
            if(sp.Product.equals(productName)){
                return sp;
            }
        }

        return null;
    }


    @RequestMapping("/getAllProducts")
    public List<StoreProduct> getAllProducts(){
        return (List<StoreProduct>) SPR.findAll();
    }


    private StoreProduct get(List<StoreProduct> pros, String productName){

        for(int i=0; i<pros.size(); ++i){
            if(pros.get(i).getProduct().equals(productName)){
                return pros.get(i);
            }
        }

        return null;

    }

}
