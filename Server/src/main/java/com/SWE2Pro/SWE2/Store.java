package com.SWE2Pro.SWE2;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    @JsonProperty("Name")
    String Name;

    @JsonProperty("Location")
    String Location;
    @JsonProperty("Type")
    String Type;


    public Store(){
        this.Name = "";
        this.Location = "";
        this.Type="";
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
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
