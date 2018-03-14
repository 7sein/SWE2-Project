package com.SWE2Pro.SWE2;


import javax.persistence.*;
import java.util.List;

@Entity
public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String Name, Category;

    @OneToMany(cascade = CascadeType.ALL)
    List <Product> product;

    Brand(){}

    Brand(String name, String category){
        this.Name = name;
        this.Category = category;
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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }


}
