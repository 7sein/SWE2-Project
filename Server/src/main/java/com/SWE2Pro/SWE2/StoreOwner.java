package com.SWE2Pro.SWE2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class StoreOwner extends User {

    public StoreOwner(){}

    public StoreOwner(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "StoreOwner";
    }

}
