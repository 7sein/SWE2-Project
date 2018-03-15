package com.SWE2Pro.SWE2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class StoreOwner extends User {


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "storeOwner")
    private Set<Store> stores;

    public StoreOwner(){}

    public StoreOwner(String Name, String UserName, String Password){
        super(Name, UserName, Password);
        this.Type = "StoreOwner";
    }

    public Set<Store> getStores() {
        return stores;
    }

    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }



}
