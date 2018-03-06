package com.SWE2Pro.SWE2;

public class Customer extends User {

    public Customer(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "Customer";
    }

}
