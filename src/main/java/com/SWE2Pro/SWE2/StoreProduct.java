package com.SWE2Pro.SWE2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreProduct {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    int UsersViews;
    int BoughtProducts;

    String Brand, Product, Store;

    int StoreID;
    int ProductID;
    int BrandID;

    public StoreProduct(){
        BoughtProducts = 0;
        UsersViews = 0;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getUsersViews() {
        return UsersViews;
    }

    public void setUsersViews(int usersViews) {
        UsersViews = usersViews;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getStore() {
        return Store;
    }

    public void setStore(String store) {
        Store = store;
    }

    public int getBoughtProducts() {
        return BoughtProducts;
    }

    public void setBoughtProducts(int boughtProducts) {
        BoughtProducts = boughtProducts;
    }

    public int getStoreID() {
        return StoreID;
    }

    public void setStoreID(int storeID) {
        StoreID = storeID;
    }


    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getBrandID() {
        return BrandID;
    }

    public void setBrandID(int brandID) {
        BrandID = brandID;
    }


}
