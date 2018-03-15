package com.SWE2Pro.SWE2;

import javax.persistence.Entity;

@Entity
public class Customer extends User {

    public Customer(){};

    public Customer(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "Customer";
    }

}
