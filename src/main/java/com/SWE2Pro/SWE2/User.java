package com.SWE2Pro.SWE2;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    protected String name;
    protected String UserName, Password, Type;

    public User(){}

    public User(String Name, String UserName, String Password){
        this.name = Name;
        this.UserName = UserName;
        this.Password = Password;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getId() {
        return Id;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName(){
        return name;
    }

    public String getUserName(){
        return UserName;
    }

    public String getPassword(){
        return Password;
    }

    public String getType(){
        return Type;
    }

}
