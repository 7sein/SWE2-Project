package com.SWE2Pro.SWE2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    private UserRepository UR;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String Login(Model model) {
        model.addAttribute("User", new User());
        return "index";
    }

    @PostMapping("/login")
    public String Login1(@ModelAttribute User usr) {
        List<User> ret = UR.findByName(usr.UserName);
        if(ret.size() == 1){

            if(!ret.get(0).Password.equals(usr.Password)){
                return "index";
            }

            if(ret.get(0).Type == "Admin") {
                return "AdminProfile";
            } else if(ret.get(0).Type == "StoreOwner"){
                return "StoreOwnerProfile";
            } else {
                return "CustomerProfile";
            }
        } else {
            return "index";
        }

    }

    @GetMapping("/SignUp")
    public String SignUp(Model model) {
        model.addAttribute("User", new User());
        return "index";
    }

    @PostMapping("/SignUp")
    public String SignUp1(@ModelAttribute User usr) {
        List<User> ret = UR.findByName(usr.UserName);
        if(ret.size() != 0){
            UR.save(usr);
            return "index";
        } else {
            return "index";
        }

    }

}
