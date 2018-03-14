package com.SWE2Pro.SWE2;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    String Name;
    String Category;
    @ManyToOne (cascade = CascadeType.ALL)
    Brand Brand;

    double Price;
    @ManyToMany(mappedBy="Products", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Store> Stores;

    public Product(){};
    public Product(String Name, String Category,Brand brand ,double Price){
        this.Name = Name;
        this.Category = Category;
        this.Price = Price;
        this.Brand=brand;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Brand getBrand() {
        return Brand;
    }

    public void setBrand(Brand brand) {
        Brand = brand;
    }

    public Long getId(){ return Id; }
    public String getName(){
        return Name;
    }
    public String getCategory(){
        return Category;
    }
    public double getPrice(){
        return Price;
    }

}
