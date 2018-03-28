package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    @Autowired
    private UserRepository UR;



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
        List<Store> stores1 = SR.findAll();
        model.addAttribute("Stores", getStores((User)sessions.getSession().getAttribute("owner"), stores1));
        model.addAttribute("StoreProducts", new ArrayList<StoreProduct>());


        if(stores.size() == 0){
            sto.setStoreOwner((User)sessions.getSession().getAttribute("owner"));
            SR.save(sto);
        }


        return "StoreOwnerProfile";

    }

    @RequestMapping("/showStore/{storeName}")
    public String showStore(Model model, @PathVariable String storeName) {
        model.addAttribute("Products", SPR.findByStore(storeName));
        model.addAttribute("Stores",  SR.findAll());
        return "CustomerProfile";
    }

    @GetMapping("/addProductToStore")
    public String addProductToStore(Model model, HttpServletRequest sessions){
        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());
        List<Store> stores1 = SR.findAll();
        model.addAttribute("Stores", getStores((User)sessions.getSession().getAttribute("owner"), stores1));
        model.addAttribute("StoreProducts", new ArrayList<StoreProduct>());


        List<Store> stores = SR.findAll();
        model.addAttribute("Stores", getStores(((User)sessions.getSession().getAttribute("owner")), stores));
        return "StoreOwnerProfile";

    }

    @PostMapping("/addProductToStore")
    public String addProductToStore1(@ModelAttribute @Valid StoreProduct SP, Model model, HttpServletRequest sessions) {

        model.addAttribute("Store", new Store());
        model.addAttribute("StoreProduct", new StoreProduct());
        List<Store> stores1 = SR.findAll();
        model.addAttribute("Stores", getStores((User)sessions.getSession().getAttribute("owner"), stores1));
        model.addAttribute("StoreProducts", new ArrayList<Store>());


        List<Product> products = PR.findByName(SP.Product);
        List<Brand>   brands   = BR.findByName(SP.Brand);
        List<Store>   stores   = SR.findByName(SP.Store);


        if(products.size() == 0 || brands.size() == 0 || stores.size() == 0) {
            return "StoreOwnerProfile";
        }

        SP.setStoreID(stores.get(0).getId());
        SP.setProductID(products.get(0).getId());
        SP.setBrandID(brands.get(0).getId());

        SPR.save(SP);

        return "StoreOwnerProfile";

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
