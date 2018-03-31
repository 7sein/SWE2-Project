package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class StoreController {

    @Autowired
    private StoreRepository SR;
    @Autowired
    private ProductRepository PR;
    @Autowired
    private BrandRepository BR;
    @Autowired
    private StoreProductRepository SPR;
    @Autowired
    private UserRepository UR;


    @GetMapping("/addstore")
    public Map addstore(Model model) {
        return Collections.singletonMap("status", "NotOk");


    }

    @PostMapping("/addstore")
    public Map addstore1(@RequestBody Store sto, HttpServletRequest sessions) {


        List<Store> stores = SR.findByName(sto.Name);

        if(stores.size() == 0){
            sto.setStoreOwner((User)sessions.getSession().getAttribute("owner"));
            SR.save(sto);
            return Collections.singletonMap("status", "Ok");

        }

        return Collections.singletonMap("status", "NotOk");

    }

    @RequestMapping("/showStore/{storeName}")
    public List<StoreProduct> showStore(@PathVariable String storeName) {
        List<StoreProduct> Products = SPR.findByStore(storeName);
        return Products;
    }

    @GetMapping("/addProductToStore")
    public Map addProductToStore(){

        return Collections.singletonMap("status", "NotOk");

    }

    @PostMapping("/addProductToStore")
    public Map addProductToStore1(@RequestBody StoreProduct SP){

        List<Product> products = PR.findByName(SP.Product);
        List<Brand>   brands   = BR.findByName(SP.Brand);
        List<Store>   stores   = SR.findByName(SP.Store);


        if(products.size() == 0 || brands.size() == 0 || stores.size() == 0) {
            return Collections.singletonMap("status", "NotOk");
        }

        SP.setStoreID(stores.get(0).getId());
        SP.setProductID(products.get(0).getId());
        SP.setBrandID(brands.get(0).getId());

        SPR.save(SP);

        return Collections.singletonMap("status", "Ok");

    }

    @RequestMapping("/getStoresStatistics")
    public List<StoreProduct> getStoresProducts(HttpServletRequest sessions){

        List<Store> myStores = getStores((User)sessions.getSession().getAttribute("owner"), SR.findAll());

        List<StoreProduct> ret = new ArrayList<>();

        for (Store S: myStores){

            List<StoreProduct> thisStoreProducts = SPR.findByStore(S.Name);

            for(StoreProduct sp: thisStoreProducts){
                ret.add(sp);
            }

        }

        return ret;

    }

    private List<Store> getStores(User owner, List<Store> stores){

        List<Store> stores1 = new ArrayList<>();

        for(int i=0; i<stores.size(); ++i){

            if(stores.get(i).getStoreOwner().equals(owner)){
                stores1.add(stores.get(i));
            }

        }

        return stores1;

    }

}
