package com.SWE2Pro.SWE2;

public class StoreOwner extends User {

    public StoreOwner(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "StoreOwner";
    }

}
