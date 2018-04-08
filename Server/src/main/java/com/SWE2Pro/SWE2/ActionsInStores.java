package com.SWE2Pro.SWE2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActionsInStores {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    private Long storeId;
    private String Action;

    public ActionsInStores(){}

    public ActionsInStores(Long storeId, String action) {
        this.storeId = storeId;
        Action = action;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String action) {
        Action = action;
    }
}
