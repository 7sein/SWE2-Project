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
    @Autowired
    private Stores_StoreOwners_Repository SSR;
    @Autowired
    private ActionsInStoresRepository ASR;


    @GetMapping("/addstore")
    public Map addstore(Model model) {
        return Collections.singletonMap("status", "NotOk");
    }

    @PostMapping("/addstore")
    public Map addstore1(@RequestBody Store sto, HttpServletRequest s) {

        List<Store> stores = SR.findByName(sto.Name);

        if(stores.size() == 0){
            SR.save(sto);
            Long storeId = SR.findByName(sto.Name).get(0).getId();
            Long storeOwnerId = ((User)s.getSession().getAttribute("owner")).getId();
            SSR.save(new Stores_StoreOwners(storeId, storeOwnerId));
            return Collections.singletonMap("status", "Ok");

        }

        return Collections.singletonMap("status", "NotOk");

    }

    @RequestMapping("/getAllStores")
    public List<Store> getAllStores(HttpServletRequest s){

        Long id = ((User)s.getSession().getAttribute("owner")).getId();
        List<Stores_StoreOwners> SS = SSR.getStores(id);

        System.out.println(SS.size());

        List<Store> ret = new ArrayList<>();
        for(Stores_StoreOwners ss: SS){
            ret.add(SR.findById(ss.getStoreId()).get());
        }

        return ret;

    }

    @GetMapping("/addProductToStore")
    public Map addProductToStore(){

        return Collections.singletonMap("status", "NotOk");

    }

    @PostMapping("/addProductToStore")
    public Map addProductToStore1(@RequestBody StoreProduct SP, HttpServletRequest s){

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

        Long storeId = SPR.findByStore(SP.Store).get(0).getStoreID();
        String user = ((User)s.getSession().getAttribute("owner")).getUserName();
        String Action = user + " added " + SP.Product;

        ASR.save(new ActionsInStores(storeId, Action));

        return Collections.singletonMap("status", "Ok");

    }

    @RequestMapping("/getStoreProducts/{storeName}")
    public List<StoreProduct> getStoreProducts(@PathVariable String storeName, HttpServletRequest s){

        return SPR.findByStore(storeName);

    }

    @RequestMapping("/checkOriginal/{storeName}")
    public Map checkOriginal(@PathVariable String storeName, HttpServletRequest s){

        Long ownerId = ((User)s.getSession().getAttribute("owner")).getId();
        Long storeId = SR.findByName(storeName).get(0).getId();

        System.out.println(SSR.getStoreOwners(storeId).get(0).getStoreOwnerId());

        if (SSR.getStoreOwners(storeId).get(0).getStoreOwnerId() == ownerId){
            return Collections.singletonMap("status", "Ok");
        }

        return Collections.singletonMap("status", "notOk");

    }

    @RequestMapping("/getActions/{storeName}")
    public List<ActionsInStores> getActions(@PathVariable String storeName){

        Long storeId = SR.findByName(storeName).get(0).getId();

        return ASR.getActions(storeId);

    }

}
