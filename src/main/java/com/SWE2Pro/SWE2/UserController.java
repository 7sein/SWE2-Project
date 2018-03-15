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
    @Autowired
    private StoreRepository SR;


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

        List<User> ret = UR.findByName(usr.UserName);

        if(ret.size() > 0){

            if(!ret.get(0).Password.equals(usr.Password)){
                model.addAttribute("User", new User());
                return "index";
            }

            if(ret.get(0).Type.equals("Admin")) {
                model.addAttribute("Product", new Product());
                model.addAttribute("Brand", new Brand());
                s.getSession().setAttribute("owner" ,usr);
                return "AdminProfile";
            } else if(ret.get(0).Type.equals("StoreOwner")){

                model.addAttribute("Store", new Store());
                model.addAttribute("StoreProduct", new StoreProduct());
                //model.addAttribute("myStores", );

                s.getSession().setAttribute("owner" ,usr);
                return "StoreOwnerProfile";

            } else{

                model.addAttribute("Stores", SR.findAll());
                s.getSession().setAttribute("owner" ,usr);
                return "CustomerProfile";

            }

        } else {

            model.addAttribute("Stores", UR.findAll());
            model.addAttribute("User", new User());

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
