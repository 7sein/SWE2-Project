package com.SWE2Pro.SWE2;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreProduct {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @JsonProperty("UsersViews")
    int UsersViews;
    @JsonProperty("BoughtProducts")
    int BoughtProducts;

    @JsonProperty("Brand")
    String Brand;
    @JsonProperty("Product")
    String Product;
    @JsonProperty("Store")
    String Store;

    @JsonProperty("StoreID")
    Long StoreID;
    @JsonProperty("ProductID")
    Long ProductID;
    @JsonProperty("BrandID")
    Long BrandID;

    public StoreProduct(){
        BoughtProducts = 0;
        UsersViews = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (Id == null || obj == null || getClass() != obj.getClass())
            return false;

        StoreProduct that = (StoreProduct) obj;
        return Id.equals(that.Id);

    }
    @Override
    public int hashCode() {
        return Id == null ? 0 : Id.hashCode();
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

    public Long getStoreID() {
        return StoreID;
    }

    public void setStoreID(Long storeID) {
        StoreID = storeID;
    }


    public Long getProductID() {
        return ProductID;
    }

    public void setProductID(Long productID) {
        ProductID = productID;
    }

    public Long getBrandID() {
        return BrandID;
    }

    public void setBrandID(Long brandID) {
        BrandID = brandID;
    }


}
