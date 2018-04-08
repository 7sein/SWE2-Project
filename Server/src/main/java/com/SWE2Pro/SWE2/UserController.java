package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository UR;
    @Autowired
    private StoreRepository SR;
    @Autowired
    private Stores_StoreOwners_Repository SSR;


    @GetMapping("/login")
    public Map Login() {

        return Collections.singletonMap("status", "NotOk");

    }

    @PostMapping("/login")
    public Map Login1(@RequestBody User usr, HttpServletRequest s) {

        System.out.println(usr.UserName + " " + usr.Password);

        List<User> ret = UR.findByName(usr.UserName);

        if(ret.size() > 0){

            if(!ret.get(0).Password.equals(usr.Password)){
                return Collections.singletonMap("status", "NotOk");

            }

            s.getSession().setAttribute("owner" ,ret.get(0));

            if(ret.get(0).Type.equals("Admin")) {
                return Collections.singletonMap("status", "Admin");
            } else if(ret.get(0).Type.equals("StoreOwner")){
                return Collections.singletonMap("status", "StoreOwner");
            } else{
                return Collections.singletonMap("status", "Customer");
            }

        }

        return Collections.singletonMap("status", "NotOk");

    }

    @GetMapping("/SignUp")
    public Map SignUp() {
        return Collections.singletonMap("status", "NotOk");

    }

    @PostMapping("/SignUp")
    public Map SignUp1(@RequestBody User usr) {

        List<User> ret = UR.findByName(usr.UserName);

        if(ret.size() == 0){
            UR.save(usr);
            return Collections.singletonMap("status", "Ok");
        } else {
            return Collections.singletonMap("status", "Ok");
        }

    }

    @RequestMapping("/addNewCollaporator/{storeName}/{userName}")
    public Map addNewCollaporator(@PathVariable String storeName, @PathVariable String userName, HttpServletRequest s){

        //System.out.println(storeName + " " + userName);

        List<Store> stores = SR.findByName(storeName);
        List<User> users = UR.findByName(userName);

        if(stores.size() == 0 || users.size() == 0)
            return Collections.singletonMap("status", "notOk0");

        //System.out.println(users.get(0).getType());

        if(!users.get(0).getType().equals("StoreOwner"))
            return Collections.singletonMap("status", "notOk1");

        SSR.save(new Stores_StoreOwners(stores.get(0).getId(), users.get(0).getId()));

        return Collections.singletonMap("status", "Ok");

    }

}
