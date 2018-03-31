package com.SWE2Pro.SWE2;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int Id;
    @JsonProperty("Name")
    String Name;

    @ManyToOne(targetEntity = User.class)
    User storeOwner;
    @JsonProperty("Location")
    String Location;
    @JsonProperty("Type")
    String Type;


    public Store(){
        this.Name = "";
        this.Location = "";
        this.Type="";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public User getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(User storeOwner) {
        this.storeOwner = storeOwner;
    }


    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

}
