package com.SWE2Pro.SWE2;


import javax.persistence.*;

@Entity
public class User {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    protected String Name;
    protected String UserName, Password, Type;

    public User(){}

    public User(String Name, String UserName, String Password){
        this.Name = Name;
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
        this.Name = Name;
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
        return Name;
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
