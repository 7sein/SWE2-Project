package com.SWE2Pro.SWE2;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StoreController {
    @Autowired
    private StoreRepository ST;

    @GetMapping("/addstore")
    public String addstore(Model model) {
        model.addAttribute("Store", new Store());
        return "index";
    }

    @PostMapping("/addstore")
    public String addstore1(@ModelAttribute Store sto, Model model, HttpServletRequest sessions) {

        List<Store> stores = ST.findByName(sto.Name);
        model.addAttribute("Store", new Store());
        if(stores.size() == 0){
            sto.StoreOwner.setUserName((String) sessions.getSession().getAttribute("name"));
            ST.save(sto);
        }
        return "StoreOwnerProfile";
    }

}
