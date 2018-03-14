package com.SWE2Pro.SWE2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepository UR;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("User", new User());
        return "index";
    }

    @GetMapping("/login")
    public String Login(Model model) {
        model.addAttribute("User", new User());
        return "index";
    }

    @PostMapping("/login")
    public String Login1(@ModelAttribute User usr, Model model , HttpServletRequest s) {
        model.addAttribute("User", new User());
        List<User> ret = UR.findByName(usr.UserName);
        if(ret.size() == 1){

            if(!ret.get(0).Password.equals(usr.Password)){
                return "index";
            }

            if(ret.get(0).Type.equals("Admin")) {
                model.addAttribute("Product", new Product());
                model.addAttribute("Brand", new Brand());
                s.getSession().setAttribute("name" ,usr.getUserName());
                return "AdminProfile";
            } else if(ret.get(0).Type.equals("StoreOwner")){
                model.addAttribute("Store", new Store());
                s.getSession().setAttribute("name" ,usr.getUserName());
                return "StoreOwnerProfile";
            } else{
                s.getSession().setAttribute("name" ,usr.getUserName());
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
    public String SignUp1(@ModelAttribute User usr, Model model) {

        List<User> ret = UR.findByName(usr.UserName);
        model.addAttribute("User", new User());
        if(ret.size() == 0){
            UR.save(usr);
            return "index";
        } else {
            return "index";
        }

    }

}
