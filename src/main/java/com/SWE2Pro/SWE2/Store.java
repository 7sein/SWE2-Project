package com.SWE2Pro.SWE2;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String Name;

    @ManyToOne(cascade = CascadeType.ALL)
    StoreOwner StoreOwner;
    String Location;
    String Type;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="store_prodects", joinColumns = {@JoinColumn(name="store_id", referencedColumnName = "Id")}, inverseJoinColumns =  {@JoinColumn(name="product_id", referencedColumnName = "Id")})
    List<Product> Products; // id of product
    int UsersViews, UsersBought, BoughtProducts;

    public Store(){
        this.Name = "";
        this.StoreOwner = new StoreOwner();
        this.Location = "";
        this.Products = new ArrayList<>();
        this.UsersViews = this.UsersBought = this.BoughtProducts = 0;
        this.Type="";
    }

    public Store(String Name, StoreOwner StoreOwner, String Location, String type ){
        this.Name = Name;
        this.StoreOwner = StoreOwner;
        this.Location = Location;
        this.Products = new ArrayList<>();
        this.UsersViews = this.UsersBought = this.BoughtProducts = 0;
        this.Type=type;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public com.SWE2Pro.SWE2.StoreOwner getStoreOwner() {
        return StoreOwner;
    }

    public void setStoreOwner(com.SWE2Pro.SWE2.StoreOwner storeOwner) {
        StoreOwner = storeOwner;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }

    public int getUsersViews() {
        return UsersViews;
    }

    public void setUsersViews(int usersViews) {
        UsersViews = usersViews;
    }

    public int getUsersBought() {
        return UsersBought;
    }

    public void setUsersBought(int usersBought) {
        UsersBought = usersBought;
    }

    public int getBoughtProducts() {
        return BoughtProducts;
    }

    public void setBoughtProducts(int boughtProducts) {
        BoughtProducts = boughtProducts;
    }
    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}
