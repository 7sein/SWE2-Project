package com.SWE2Pro.SWE2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stores_StoreOwners {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    private Long StoreId;
    private Long StoreOwnerId;

    public Stores_StoreOwners(){}

    public Stores_StoreOwners(Long storeId, Long storeOwnerId) {
        StoreId = storeId;
        StoreOwnerId = storeOwnerId;
    }

    public Long getStoreId() {
        return StoreId;
    }

    public void setStoreId(Long storeId) {
        StoreId = storeId;
    }

    public Long getStoreOwnerId() {
        return StoreOwnerId;
    }

    public void setStoreOwnerId(Long storeOwnerId) {
        StoreOwnerId = storeOwnerId;
    }
}
