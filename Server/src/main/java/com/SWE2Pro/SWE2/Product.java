package com.SWE2Pro.SWE2;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Product {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;

    @JsonProperty("Name")
    String Name;
    @JsonProperty("Category")
    String Category;
    @JsonProperty("Price")
    double Price;

    public Product(){};
    public Product(String Name, String Category,Brand brand ,double Price){
        this.Name = Name;
        this.Category = Category;
        this.Price = Price;
    }

    public void setId(int id) {
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

    public int getId(){ return Id; }
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
