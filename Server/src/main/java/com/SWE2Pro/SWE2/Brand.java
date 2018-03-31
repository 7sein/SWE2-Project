package com.SWE2Pro.SWE2;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;
    @JsonProperty("Name")
    String Name;
    @JsonProperty("Category")
    String Category;

    Brand(){}

    Brand(String name, String category){
        this.Name = name;
        this.Category = category;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }



}
