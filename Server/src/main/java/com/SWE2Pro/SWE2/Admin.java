package com.SWE2Pro.SWE2;

public class Admin extends User{

    public Admin(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "Admin";
    }

}
